package org.finalsection;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Callbacks {
    public static void main(String[] args) {
        Consumer<String> callback = s -> System.out.println("No last name provided for " + s);
        hello("Osaretin", "Omofonmwan", callback);
        isOfAge("Sammy", 13, age -> age.equals(18));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName == null || lastName.isEmpty()) System.out.println(lastName);
        else callback.accept(firstName);
    }

    static void isOfAge(String firstName, int age, Predicate<Integer> callback) {
        boolean isOfAge = callback.test(age);
        if (!isOfAge) {
            System.out.println(firstName + " cannot get this game because he isn't of age");
            return;
        }
        System.out.println(firstName + " is eligible to purchase game");
    }
}
