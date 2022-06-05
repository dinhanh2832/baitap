package com.company.bai5;

import java.util.Arrays;

public class ArrayObjSort {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("LeeJungSoo", 29);
        ar[1] = new Person("JinHo", 15);
        ar[2] = new Person("ParkSooJung", 37);

        Arrays.sort(ar);

        for(Person p : ar)
            System.out.println(p);
    }
}
