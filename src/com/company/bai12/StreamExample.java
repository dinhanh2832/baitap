package com.company.bai12;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
//        System.out.println("원본: " + list);
        list.stream().filter(a -> a.toUpperCase().contains("JAVA")).forEach(
                a -> System.out.println(a));
    }
}
