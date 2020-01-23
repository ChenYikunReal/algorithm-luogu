package com.luogu.algorithm.os_file.expr.expr3;

public class Operator {

    private String op;

    private int pageNumber;

    private int unitNumber;

    public Operator(String op, int pageNumber, int unitNumber) {
        this.op = op;
        this.pageNumber = pageNumber;
        this.unitNumber = unitNumber;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public String getOp() {
        return this.op;
    }

    public int getUnitNumber() {
        return this.unitNumber;
    }

    public String toString() {
        return "Operator{" +
                "op='" + this.op + '\'' +
                ", pageNumber=" + this.pageNumber +
                ", unitNumber=" + this.unitNumber +
                '}';
    }
}

