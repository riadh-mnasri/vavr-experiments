package com.riadh;

import io.vavr.Tuple;

import java.util.Map;

public class TupleConcept {

    public static void main(String[] args) {
        // Create Vavr Tuple
        var t = Tuple.of("Riadh", 35);
        System.out.println(t._1);
        System.out.println(t._1());
        System.out.println(t._2);
        System.out.println(t._2());

        // Tuple from Map entry
        var map = Map.of("Riadh", 35);
        var tupleResult = Tuple.of(map);
        System.out.println(tupleResult);
    }
}
