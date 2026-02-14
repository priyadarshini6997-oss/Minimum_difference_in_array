package com.index;

import java.util.*;

public class code3 {

    static int findMinDiff(int[] arr) {

        Arrays.sort(arr);
       
        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i-1];

            if(diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 9};

        int result = findMinDiff(arr);

        System.out.println("Minimum difference is: " + result);
    }
}
