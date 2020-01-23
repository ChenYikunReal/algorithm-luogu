package com.luogu.algorithm.os_file.expr.expr4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 模拟的操作系统类
 * @author 陈奕坤
 */
public class OS {

    private LinkedList<MFD> mfd = new LinkedList<>();

    private LinkedList<AFD> afd = new LinkedList<>();

    private int afd_size=0;

    private int num=0;

    private Scanner scanner = new Scanner(System.in);

    public void register(String user_name){
        LinkedList<UFD> ufd = new LinkedList<>();
        MFD user = new MFD(user_name);
        mfd.add(user);
        UFD file = new UFD();
        ufd.add(file);
        mfd.get(num).link = ufd;
        num++;
    }

    public void login(String user_name) {
        for(int i = 0; i < mfd.size(); i++) {
            if(mfd.get(i).user_name.equals(user_name)) {
                System.out.println("……………………………………欢迎登入文件管理系统……………………………………\n");
                if(mfd.get(i).link.get(0).file_name==null) {
                    System.out.println("您还没有文件");
                } else {
                    System.out.println("以下是您的文件：");
                    System.out.println("文件名\t保护码\t文件长度\t");
                    for(int j = 0; j < mfd.get(i).link.size(); j++){
                        System.out.println(mfd.get(i).link.get(j).file_name + "\t" +
                                Arrays.toString(mfd.get(i).link.get(j).protect) +
                                "\t" + mfd.get(i).link.get(j).file_length);
                    }
                }
                boolean flag =true;
                while(flag) {
                    System.out.println("……………………………………请选择您对文件的操作……………………………………\n");
                    System.out.println("……………………………………1.创建文件……………………………………\n");
                    System.out.println("……………………………………2.打开文件……………………………………\n");
                    System.out.println("……………………………………3.删除文件……………………………………\n");
                    System.out.println("……………………………………4.打开文件列表……………………………………\n");
                    System.out.println("……………………………………5.退出文件管理系统……………………………………\n");
                    System.out.println("……………………………………请输入相关操作……………………………………\n");
                    int num = scanner.nextInt();
                    switch(num){
                        case 1:
                            create_file(user_name);
                            break;
                        case 2:
                            open_file(user_name);
                            break;
                        case 3:
                            delete_file(user_name);
                            break;
                        case 4:
                            dir(user_name);
                            break;
                        case 5:
                            flag = false;
                            break;
                        default:
                            System.out.println("操作不存在");
                    }
                }
                break;
            }
        }
        scanner.close();
    }

    public void create_file(String user_name) {
        for(int i = 0; i < mfd.size(); i++) {
            if(mfd.get(i).user_name.equals(user_name)) {
                System.out.println("请输入文件名");
                String file_name = scanner.next();
                System.out.println("请输入文件长度");
                int file_length = scanner.nextInt();
                UFD a = new UFD(file_name,file_length);
                int j;
                System.out.println(mfd.get(i).link.size());
                for(j = 0; j < mfd.get(i).link.size(); j++){
                    if(mfd.get(i).link.get(0).file_name == null) {
                        break;
                    } else if(mfd.get(i).link.get(j).file_name.equals(file_name)) {
                        System.out.println("已有文件 " + file_name + " 无法重新创建");
                        break;
                    }
                }
                if(mfd.get(i).link.get(0).file_name == null) {
                    mfd.get(i).link.removeLast();
                    mfd.get(i).link.add(a);
                    System.out.println("创建文件 "+file_name+" 成功");
                } else if(j == mfd.get(i).link.size()){
                    mfd.get(i).link.add(a);
                    System.out.println("创建文件 " + file_name + " 成功");
                }
            }
            break;
        }
    }

    public void dir(String user_name) {
        for(int i = 0; i < mfd.size(); i++) {
            if(mfd.get(i).user_name.equals(user_name)) {
                if(mfd.get(i).link.get(0).file_name == null) {
                    System.out.println("您还没有文件");
                } else {
                    System.out.println("以下是您的文件：");
                    System.out.println("文件名\t保护码\t文件长度\t");
                    for(int j = 0; j < mfd.get(i).link.size(); j++) {
                        System.out.println(mfd.get(i).link.get(j).file_name + "\t" +
                                mfd.get(i).link.get(j).protect[0] +
                                mfd.get(i).link.get(j).protect[1] +
                                mfd.get(i).link.get(j).protect[2] + "\t" +
                                mfd.get(i).link.get(j).file_length);
                    }
                }
            }
            break;
        }
    }

    public void delete_file(String user_name) {
        for(int i = 0; i < mfd.size(); i++) {
            if(mfd.get(i).user_name.equals(user_name)) {
                System.out.println("请依次输入您要删除的文件名");
                String file_name = scanner.next();
                int j;
                for(j = 0; j < mfd.get(i).link.size(); j++){
                    if(mfd.get(i).link.get(j).file_name.equals(file_name) ){
                        mfd.get(i).link.remove(j);
                        System.out.println("已成功删除文件 " + file_name);
                        afd_size--;
                        break;
                    }
                }
                if(j == mfd.get(i).link.size()){
                    System.out.println("sorry,没有找到文件 " + file_name + " 请确认您是否有该文件");
                }
                for(int m = 0; m < afd.size(); j++){
                    if(afd.get(m).open_filename.equals(file_name)) {
                        afd.remove(m);
                        break;
                    }
                }
            }
            break;
        }
    }
    public void open_file(String user_name) {
        for(int i = 0; i < mfd.size(); i++) {
            if(mfd.get(i).user_name.equals(user_name)) {
                System.out.println("请依次输入您要打开的文件名");
                String file_name = scanner.next();
                int j;
                for(j = 0; j < mfd.get(i).link.size(); j++) {
                    if(mfd.get(i).link.get(j).file_name.equals(file_name)) {
                        AFD a = new AFD();
                        a.open_filename = file_name;
                        if(afd_size == 5) {
                            afd.removeFirst();
                            afd_size--;
                        }
                        afd.add(a);
                        afd_size++;
                        System.out.println("已成功打开文件 " + file_name);
                        boolean flag = true;
                        while(flag) {
                            System.out.println("……………………………………请选择您对文件的操作……………………………………\n");
                            System.out.println("……………………………………1.写文件……………………………………\n");
                            System.out.println("……………………………………2.读文件……………………………………\n");
                            System.out.println("……………………………………3.关闭文件……………………………………\n");
                            System.out.println("……………………………………4.继续对其他文件操作……………………………………\n");
                            System.out.println("……………………………………请输入相关操作……………………………………*\n");
                            int num = scanner.nextInt();
                            switch(num) {
                                case 1:
                                    write_file(file_name);
                                    break;
                                case 2:
                                    read_file(file_name);
                                    break;
                                case 3:
                                    close_file(file_name);
                                    break;
                                case 4:
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("输入错误");
                            }
                        }
                        break;
                    }
                }
                if(j == mfd.get(i).link.size()) {
                    System.out.println("sorry,没有找到文件 "+file_name+" 请确认您是否有该文件");
                }
                break;
            }
        }
    }

    public void write_file(String file_name) {
        for(int i = 0; i < afd.size(); i++) {
            if(afd.get(i).open_filename.equals(file_name)) {
                if(afd.get(i).read) {
                    System.out.println("文件" + file_name + "正在读，不能同时写");
                } else {
                    afd.get(i).write = true;
                    System.out.println("文件" + file_name + "正在写");
                }
            }
            break;
        }
    }

    public void read_file(String file_name) {
        for(int i = 0; i < afd.size(); i++) {
            if(afd.get(i).open_filename.equals(file_name)) {
                if(afd.get(i).write) {
                    System.out.println("文件"+file_name+"正在写，不能同时读");
                }
                else{
                    afd.get(i).read = true;
                    System.out.println("文件"+file_name+"正在读");
                }
            }
            break;
        }
    }

    public void close_file(String file_name) {
        for(int i = 0; i < afd.size(); i++) {
            if(afd.get(i).open_filename.equals(file_name)) {
                if(afd.get(i).write) {
                    System.out.println("文件" + file_name + "写完毕");
                    System.out.println("文件" + file_name + "完毕");
                    afd.get(i).write = false;
                } else if(afd.get(i).read) {
                    afd.get(i).read = false;
                    System.out.println("文件" + file_name + "读完毕");
                    System.out.println("文件" + file_name + "完毕");
                } else {
                    System.out.println("文件" + file_name + "完毕");
                }
            }
            break;
        }
    }
}
