package com.luogu.algorithm.os_file.expr.expr1;

import java.util.concurrent.Semaphore;

/**
 * 生产者-消费者问题解决方案
 * @author 陈奕坤
 */
public class ProducerAndConsumer {

    /**
     * 初始容量
     */
    private static final int N = 10;

    /**
     * FULL 产品容量
     */
    private static Semaphore FULL;

    /**
     * EMPTY 空余容量
     */
    private static Semaphore EMPTY;

    /**
     * MUTEX 读写锁
     */
    private static Semaphore MUTEX;

    /**
     * 记录当前的产品数量
     */
    private static volatile int COUNT = 0;

    /**
     * full 初始化0个产品
     * empty 初始化有N个空余位置放置产品
     * mutex 初始化每次最多只有一个线程可以读写
     */
    static {
        FULL= new Semaphore(0);
        EMPTY = new Semaphore(N);
        MUTEX = new Semaphore(1);
    }

    /**
     * 生产者类
     */
    static class Producer implements Runnable{
        @Override
        public void run() {
            while (true){
                try {
                    //等待空位
                    EMPTY.acquire();
                    //等待读写锁
                    MUTEX.acquire();
                    COUNT++;
                    System.out.println("生产者生产了一个，还剩：" + COUNT);
                    //释放读写锁
                    MUTEX.release();
                    //放置产品
                    FULL.release();
                    //随机休息一段时间，让生产者线程有机会抢占读写锁
                    Thread.sleep(((int)Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 消费者类
     */
    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true){
                try {
                    //等待产品
                    FULL.acquire();
                    //等待读写锁
                    MUTEX.acquire();
                    COUNT--;
                    System.out.println("消费者消费了一个，还剩：" + COUNT);
                    //释放读写锁
                    MUTEX.release();
                    //释放空位
                    EMPTY.release();
                    //随机休息一段时间，让消费者线程有机会抢占读写锁
                    Thread.sleep(((int)Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String []args){
        //生产线线程
        new Thread(new Producer()).start();
        //消费者线程
        new Thread(new Consumer()).start();
    }
}

