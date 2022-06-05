package com.company.bai6;

public class DDBoxDemoL {
    private String name;

    public DDBoxDemoL(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
