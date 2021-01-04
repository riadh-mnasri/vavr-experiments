package com.riadh;

import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.Arrays;
import java.util.List;
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

        // Create Tuple from Iterable
        List<Tuple2<Integer, String>> list = Arrays.asList(Tuple.of(1, "foo"), Tuple.of(2, "bar"));
        var tupleFromIterable = Tuple.sequence2(list); // Tuple2(Seq(1, 2), Seq("foo", "bar")
        System.out.println(tupleFromIterable);

        // Mapping Tuple
        var tupleSample3 =  Tuple.of("Riadh", 35);
        var mappedTupple = tupleSample3.map(name -> name.toUpperCase(), age -> age%2 == 0);
        System.out.println(mappedTupple);
    }
}
