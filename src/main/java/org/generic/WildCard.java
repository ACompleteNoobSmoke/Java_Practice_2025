package org.generic;

import java.util.List;

public class WildCard {

    //<?> Unbounded wildcard, accepts anything

    /* <? extends T> Upperbound wildcard, accept T or
       anything that Extends or is a child of it
       ex <? extends Number> accepts Number or
    I  nteger, Double, Long etc because they are children of Number */

    /* <? super T> Lowerbound wildcard, accpet T or its parent
       ex <? super Integer> only accpets Integer or its parent Number */


    private static void printNumbers(List<? extends Number> numList) {
        if (numList.isEmpty()){
            System.out.println("Empty List");
            return;
        }
        numList.forEach(System.out::println);
    }

    private static void printLong(List<? super Long> longList) {

    }
}
