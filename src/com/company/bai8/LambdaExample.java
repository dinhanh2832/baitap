package com.company.bai8;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
    private static int[] scores = { 10, 50, 3 };

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];//10
        for(int sco : scores) {//3
            result = operator.applyAsInt(result, sco); // if(a <= b) return a; a = result; b = sco = 3
                                                       //else return b;
        }
        return result;
    };
    public static void main(String[] args) {

        int max = maxOrMin(
                (a, b) -> {
                    if(a >= b) return a;
                    else return b;
                }
        );
        System.out.println("최대값: " + max);

        int min = maxOrMin(
                (a, b) -> {
                    if(a <= b) return a;
                    else return b;
                }
        );
        System.out.println("최소값: " + min);
    }

}
