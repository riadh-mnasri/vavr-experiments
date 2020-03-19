package com.riadh;

import io.vavr.Function1;

public class VavrExperiments {


    public static void main(String[] args) {

        Function1<Integer, Integer> plusOne = a -> a + 1;
        Function1<Integer, Integer> multiplyByTwo = a -> a * 2;

        Function1<Integer, Integer> add1AndMultiplyBy2 = plusOne.compose(multiplyByTwo);
        System.out.println(add1AndMultiplyBy2.apply(2));
        //then(add1AndMultiplyBy2.apply(2)).isEqualTo(6);

    }
}
