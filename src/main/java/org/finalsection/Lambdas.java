package org.finalsection;

import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {
        Function<String, String> upperCaseName = String::toUpperCase;
        int length = 4;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                for (int k = 0; k < length; k++){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
