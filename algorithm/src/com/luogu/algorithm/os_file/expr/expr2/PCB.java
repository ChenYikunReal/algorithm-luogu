package com.luogu.algorithm.os_file.expr.expr2;

/**
 * PCB数据结构
 * @author 陈奕坤
 */
public class PCB {

    /**
     * PCB名称
     */
    private String name;

    /**
     * 下一个PCB（是一个引用，也相当于一个指针）
     */
    private String next;

    /**
     * 进程当前的优先级（可变）
     */
    private int priority;

    /**
     * 进程运行所需最长时间
     */
    private int needTime;

    /**
     * 进程状态
     */
    private String state;

    /**
     * 周转时间
     */
    private int roundTime;

    /**
     * 等待时间
     */
    private int waitingTime;

    /**
     * 上一次执行的CPU时间
     */
    private int lastTime;

    public PCB(String name,int needTime,int priority, String state) {
        this.name = name;
        this.needTime = needTime;
        this.priority = priority;
        this.state = state;
        this.next = null;
        this.roundTime = 0;
        this.waitingTime = 0;
        this.lastTime = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getNeedTime() {
        return needTime;
    }

    public void setNeedTime(int needTime) {
        this.needTime = needTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getRoundTime() {
        return roundTime;
    }

    public void setRoundTime(int roundTime) {
        this.roundTime = roundTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getLastTime() {
        return lastTime;
    }

    public void setLastTime(int lastTime) {
        this.lastTime = lastTime;
    }

    public String toString() {
        return this.name;
    }

}

