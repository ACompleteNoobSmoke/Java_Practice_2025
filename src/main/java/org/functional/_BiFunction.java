package org.functional;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        int answer = _BiFunction.incrementByOneAndMultiply.apply(firstNumber, secondNumber);
        System.out.println("The Answer Is: " + answer);
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = (a, b) -> ++a * b;
}
