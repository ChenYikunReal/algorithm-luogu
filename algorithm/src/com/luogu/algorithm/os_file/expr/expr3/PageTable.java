package com.luogu.algorithm.os_file.expr.expr3;

/**
 * 页表类
 */
public class PageTable {

    private int pageNumber;
    private int sign;
    private int blockNumber;
    private int diskNumber;
    private int modify;

    public PageTable(int pageNumber, int sign, int blockNumber, int diskNumber) {
        this.pageNumber = pageNumber;
        this.sign = sign;
        this.blockNumber = blockNumber;
        this.diskNumber = diskNumber;
    }

    public PageTable(int pageNumber, int sign, int diskNumber) {
        this.pageNumber = pageNumber;
        this.sign = sign;
        this.blockNumber = -1;
        this.diskNumber = diskNumber;
    }

    public PageTable() {}

    public int getModify() {
        return this.modify;
    }

    public void setModify(int modify) {
        this.modify = modify;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public int getSign() {
        return this.sign;
    }

    public int getBlockNumber() {
        return this.blockNumber;
    }

    public int getDiskNumber() {
        return this.diskNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public void setDiskNumber(int diskNumber) {
        this.diskNumber = diskNumber;
    }

}

