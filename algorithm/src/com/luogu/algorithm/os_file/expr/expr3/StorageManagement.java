package com.luogu.algorithm.os_file.expr.expr3;

import java.io.*;
import java.util.*;

/**
 * 存储管理系统类
 * @author 陈奕坤
 */
public class StorageManagement {

    private LinkedList<PageTable> pt = new LinkedList<PageTable>();

    private Queue<Operator> op = new LinkedList<Operator>();

    public void readPage(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while(line != null) {
                StringTokenizer st = new StringTokenizer(line,"_");
                int pageNumber = Integer.parseInt(st.nextToken());
                int sign = Integer.parseInt(st.nextToken());
                String s = st.nextToken();
                int blockNumber = -1;
                if(!s.equals("0")) {
                    blockNumber = Integer.parseInt(s);
                }
                int diskNumber = Integer.parseInt(st.nextToken());
                pt.add(new PageTable(pageNumber, sign, blockNumber,diskNumber));
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readOperator(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while(line != null) {
                StringTokenizer st = new StringTokenizer(line,"_");
                String or = st.nextToken();
                int pageNumber = Integer.parseInt(st.nextToken());
                int unitNumber = Integer.parseInt(st.nextToken());
                op.add(new Operator(or,pageNumber,unitNumber));
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        Operator ort = op.poll();
        while(ort != null) {
            int page = ort.getPageNumber();
            PageTable p = find(page);
            if(p.getSign() == 1) {
                System.out.println("recent page's address is : " + p.getPageNumber()*128+ort.getUnitNumber());
            } else {
                System.out.println("*pageNumber:"+ort.getPageNumber());
            }
            ort = op.poll();
        }
    }

    public PageTable find(int page) {
        PageTable p = null;
        for(PageTable obj : pt) {
            if(page == obj.getPageNumber()) {
                p = obj;
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        StorageManagement sm = new StorageManagement();
        File file = new File("src/com/neu/algorithm/os_file/expr/expr3/PageTable.txt");
        sm.readPage(file);
        File file2 = new File("src/com/neu/algorithm/os_file/expr/expr3/Operator.txt");
        sm.readOperator(file2);
        sm.execute();
    }
}

