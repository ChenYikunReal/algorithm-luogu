package com.luogu.algorithm.os_file.expr.expr3;

import java.util.*;
import java.io.*;

/**
 * LRU实现类
 * @author 陈奕坤
 */
public class LRU {

    private static int LIST_SIZE = 4;

    private static int INDEX = 0;

    private static PageTable[] PAGES = new PageTable[7];

    private static PageTable[] DISK = new PageTable[1000];

    private static PageTable[] PAGE_LIST = new PageTable[7];

    private static List<Operator> OPERATORS = new ArrayList<>();

    public static void loadPage(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while(line != null) {
                StringTokenizer st = new StringTokenizer(line,"_");
                int pageNumber = Integer.parseInt(st.nextToken());
                int sign = Integer.parseInt(st.nextToken());
                String s = st.nextToken();
                int modify = Integer.parseInt(st.nextToken());
                int blockNumber = -1;
                if(!s.equals("0"))
                    blockNumber = Integer.parseInt(s);
                int diskNumber = Integer.parseInt(st.nextToken());
                PageTable page = new PageTable(pageNumber, sign, blockNumber, diskNumber);
                page.setModify(modify);
                PAGES[pageNumber] = page;
                DISK[diskNumber] = page;
                if(sign == 1) {
                    PAGE_LIST[INDEX++] = page;
                    INDEX %= LIST_SIZE;
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadOperator(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while(line != null) {
                StringTokenizer st = new StringTokenizer(line,"_");
                String or = st.nextToken();
                int pageNumber = Integer.parseInt(st.nextToken());
                int unitNumber = Integer.parseInt(st.nextToken());
                OPERATORS.add(new Operator(or, pageNumber, unitNumber));
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lru(File page, File op) {
        loadPage(page);
        loadOperator(op);
        List<PageTable> pgs = new ArrayList<>();
        for(PageTable p : PAGE_LIST) {
            if(p != null) {
                pgs.add(p);
            }
        }
        for(Operator or : OPERATORS) {
            while(true) {
                int pageNumber = or.getPageNumber();
                PageTable p = PAGES[pageNumber];
                if(p == null || p.getSign() != 1) {
                    PageTable localPage = pgs.get(pgs.size()-1);
                    if(localPage.getModify() == 1) {
                        System.out.println("OUT : " + INDEX);
                    }
                    pgs.add(0, p);
                    System.out.println("IN : " + pageNumber);
                    p.setSign(1);
                    p.setModify(0);
                    INDEX = (INDEX + 1) % LIST_SIZE;
                    continue;
                }else {
                    int address = PAGES[pageNumber].getPageNumber()*128 + PAGES[pageNumber].getPageNumber() +
                            or.getUnitNumber();
                    if(or.getOp().equals("s")) {
                        p.setModify(1);
                    }
                    System.out.println("recent page's address is : " + address);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        File pageTable = new File("src/com/neu/algorithm/os_file/expr/expr3/PageTable2.txt");
        File operator  = new File("src/com/neu/algorithm/os_file/expr/expr3/Operator.txt");
        lru(pageTable, operator);
    }

}

