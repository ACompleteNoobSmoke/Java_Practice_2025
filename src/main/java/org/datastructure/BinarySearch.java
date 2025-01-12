package org.datastructure;

import java.util.Arrays;

public class BinarySearch {

    private int[] arrNums;
    private int start;
    private int end;

    public BinarySearch(int[] arrNums){
        this.arrNums = arrNums;
        this.start = 0;
        this.end = arrNums.length - 1;
    }

    private boolean isEmpty(){
        return arrNums == null || arrNums.length == 0;
    }

    private boolean isSingleton(){
        return  arrNums.length == 1;
    }

    public boolean searchIfContains(int target){
        if (isEmpty()) return false;
        if (isSingleton()) return arrNums[start] == target;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arrNums[middle] == target) return true;
            else if (arrNums[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return false;
    }

    public int searchIndex (int target) {
        if (isEmpty()) return -1;
        if (isSingleton()) return (arrNums[start] == target) ? start : -1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arrNums[middle] == target) return middle;
            else if (arrNums[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int length = 25;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++ ) arr[i] = i * 4;
        BinarySearch binarySearch = new BinarySearch(arr);
        int target = 64;
        boolean containsTarget = binarySearch.searchIfContains(target);
        if (!containsTarget){
            System.out.println("Does Not Contain: " + target);
            return;
        }

        for (int n: arr) System.out.print(n + " ");
        System.out.println("\nArray Does Contain " + target + " At Index " + binarySearch.searchIndex(target));

    }
}
