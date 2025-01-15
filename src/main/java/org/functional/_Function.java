package org.functional;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incrementNumber = _Function.increment(1);
        System.out.println(incrementNumber);
        int incrementByFunction = incrementByOneFunction.apply(4);
        System.out.println(incrementByFunction);
        String answer = incrementByOneFunction.andThen(incrementBy10Function).andThen(printAnswer).apply(4);
        System.out.println(answer);
    }

    static Function<Integer, Integer> incrementByOneFunction = integer ->  ++integer;
    static Function<Integer, Integer> incrementBy10Function = integer -> integer * 10;

    static Function<Integer, String> printAnswer = integer -> "The Answer Is " + integer;
    static int increment(int number) {
        return ++number;
    }
}
