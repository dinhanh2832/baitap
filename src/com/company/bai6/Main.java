package com.company.bai6;

public class Main {
    public static void main(String[] args) {
        DBox<DDBoxDemoL,DDBoxDemoR> dBox = new DBox();
        DDBoxDemoL ddBoxDemoL = new DDBoxDemoL("Apple");
        DDBoxDemoR ddBoxDemoR = new DDBoxDemoR(25);
        dBox.set(ddBoxDemoL,ddBoxDemoR);
        DBox<DDBoxDemoL,DDBoxDemoR> dBox2 = new DBox();
        DDBoxDemoL ddBoxDemoL1 = new DDBoxDemoL("Orange");
        DDBoxDemoR ddBoxDemoR1 = new DDBoxDemoR(33);
        dBox2.set(ddBoxDemoL1,ddBoxDemoR1);
        System.out.println(dBox);
        System.out.println(dBox2);
    }
}
