package com.company.bai7;

public class BoxSwapDemo {
    public static void swapBox(Box<Integer> box1,Box<Integer> box2){//box1 99, box2 55
        int mid = box1.get();//99
        box1.set(box2.get());//box1 55, box2 55
        box2.set(mid);
    }
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(99);

        Box<Integer> box2 = new Box<>();
        box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());
        swapBox(box1, box2);
        System.out.println(box1.get() + " & " + box2.get());

    }
}
