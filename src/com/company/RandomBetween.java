package com.company;

public class RandomBetween {
    private int A;
    private int Z;

    public RandomBetween(int A,int Z){
        this.A = A;
        this.Z = Z;
    }

    public void createBetween(){
        System.out.println("입력1:" + A);
        System.out.println("입력2:" + Z);
        System.out.println(A);
        int check = 0;
        if( A > Z) {
            while (check < 8){
                double rs = Math.random() ;
                rs = rs * 100 + 1;
                int result = (int) rs;
                if( result < A && result > Z){
                    System.out.println(result);
                    check ++;
                }
            }
        } else {
            while (check < 8){
                double rs = Math.random() ;
                rs = rs * 100 + 1;
                int result = (int) rs;
                if( result > A && result < Z){
                    System.out.println(result);
                    check ++;
                }
            }
        }
        System.out.println(Z);
    }
}
