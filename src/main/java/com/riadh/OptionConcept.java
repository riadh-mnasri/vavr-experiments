package com.riadh;

import io.vavr.control.Option;

import java.util.List;
import java.util.Optional;

public class OptionConcept {
    public static void main(String[] args) {
        // Basic Manipulation
        var option1 = Option.of("Kotlin");
        var option2 = Option.some("Kotlin");
        System.out.println(option1.equals(option2));
        // Instantiate from Java Optional
        var optionalLanguage = Option.ofOptional(Optional.ofNullable("Scala"));
        System.out.println(optionalLanguage.getOrElse("Absent"));
        // Conditionally create an Option
        var age = 35;
        var optionalWithCondition = Option.when(age % 2 == 0, "Riadh");
        System.out.println(optionalWithCondition.getOrElse("Alphano"));

        var balance = 2000;
        var optional2WithCondition  = Option.when(balance > 0, () -> "Good");
        System.out.println(optional2WithCondition.isDefined());
        System.out.println(optional2WithCondition.getOrElse("Alphano"));

        // Option from Sequence
        var optionFromSequence = Option.traverse(List.of(1, 2, 3), e -> Option.of(e > 0 ? e : null));
        System.out.println(optionFromSequence.isDefined());
        System.out.println(optionFromSequence.get());



    }
}
