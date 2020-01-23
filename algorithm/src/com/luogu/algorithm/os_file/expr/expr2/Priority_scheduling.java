package com.luogu.algorithm.os_file.expr.expr2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 进程Or线程的优先级调度
 * @author 陈奕坤
 */
public class Priority_scheduling {

    /**
     * PCB的集合
     */
    private List<PCB> pcbList;

    /**
     * CPU时间
     */
    private int cpuTime = 0;

    /**
     * 5个PCB
     */
    private PCB p1, p2, p3, p4, p5;

    /**
     * 初始化块
     */
    {
        pcbList = new LinkedList<>();
        p1 = new PCB("P1",2,1,"ready");
        p2 = new PCB("P2",3,5,"ready");
        p3 = new PCB("P3",1,3,"ready");
        p4 = new PCB("P4",2,4,"ready");
        p5 = new PCB("P5",4,2,"ready");
        pcbList.add(p1);
        pcbList.add(p2);
        pcbList.add(p3);
        pcbList.add(p4);
        pcbList.add(p5);
    }

    public int getHighPriority() {
        int i = -100;
        int index = -100;
        for(int j = 0; j < pcbList.size(); j++) {
            int m = pcbList.get(j).getPriority();
            if(pcbList.get(j).getState().equals("ready") && i < m) {
                i = m;
                index = j;
            }
        }
        if(index == -100) {
            return 0;
        }
        return index;
    }

    public Boolean isDone() {
        boolean flag = false;
        for(int j = 0; j < pcbList.size(); j++) {
            if(pcbList.get(j).getState().equals("finish")) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void writeState() {
        for(int j = 0; j < pcbList.size(); j++) {
            System.out.println(pcbList.get(j).getName() + "       " +
                    pcbList.get(j).getNeedTime() + "          " + pcbList.get(j).getPriority() +
                    "         " + pcbList.get(j).getState());
        }
        System.out.println();
    }

    public void run() {
        System.out.println("INPUT NAME , NEEDTIME AND PRIORITY");
        for (PCB pcb: pcbList) {
            System.out.println(pcb.getName() + "             " + pcb.getNeedTime() + "            " +
                    pcb.getPriority());
        }
        System.out.println();
        System.out.println("OUTPUT  OF  PRIORITY:");
        while (!isDone()) {
            int max = getHighPriority();
            PCB maxObj = pcbList.get(max);
            if (maxObj.getNeedTime() > 0) {
                maxObj.setPriority(maxObj.getPriority()-1);
                maxObj.setNeedTime(maxObj.getNeedTime()-1);
                maxObj.setRoundTime(cpuTime+1);
                maxObj.setWaitingTime(maxObj.getWaitingTime()+(cpuTime-maxObj.getLastTime()));
                maxObj.setLastTime(cpuTime+1);
                if(maxObj.getNeedTime() == 0) {
                    maxObj.setState("finish");
                    pcbList.remove(maxObj);
                    pcbList.add(maxObj);
                } else {
                    maxObj.setState("working");
                }
                System.out.println("CPUTIME:" + cpuTime);
                System.out.println("NAME  NEEDTIME  PRIORITY     STATE");
                writeState();
                if(maxObj.getState().equals("working")) {
                    maxObj.setState("ready");
                    pcbList.remove(maxObj);
                    pcbList.add(maxObj);
                }
            }
            cpuTime++;
        }
        System.out.println("NAME   RoundTime   WaitingTime");
        pcbList.sort(new Comparator<PCB>() {
            @Override
            public int compare(PCB pcb1, PCB pcb2) {
                return pcb1.getName().compareTo(pcb2.getName());
            }
        });
        for (PCB pcb : pcbList) {
            System.out.println(pcb.getName() + "      " + pcb.getRoundTime() + "             " + pcb.getWaitingTime());
        }
    }

    public static void main(String[] args) {
        new Priority_scheduling().run();
    }

}

