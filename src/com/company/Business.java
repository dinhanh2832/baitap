package com.company;

public class Business implements Cloneable {
    private String company;
    private String work;

    public Business(String company, String work) {
        this.company = company;
        this.work = work;
    }

    public void showBusinessInfo() {
        System.out.println("회사: " + company);
        System.out.println("업무: " + work);
    }

}
