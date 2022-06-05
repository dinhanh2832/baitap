package com.company.bai6;

public class DDBoxDemoR {
    private int number;

    public DDBoxDemoR(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return  "" + number;
    }
}
