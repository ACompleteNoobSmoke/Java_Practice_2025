package org.generic;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        Integer[] intArr = {1, 5, 3, 2, 4, 10, 20, 14};
        System.out.println(countGreaterThan(intArr, 5));
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] elementArray, T target) {
        if (elementArray.length == 0) return 0;
        int count = 0;
        for (T e : elementArray) {
            if (e.compareTo(target) > 0)
                count ++;
        }
        return count;
    }
}
