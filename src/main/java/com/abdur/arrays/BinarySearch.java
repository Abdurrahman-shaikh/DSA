package com.abdur.arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(binarySearch(arr,-1, false));
    }

    public static int binarySearch(int[] arr, int target, boolean flag) {

        if (flag) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end)/2;
                if (arr[mid] == target) {
                    return target;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        } else {
            int start = arr.length - 1;
            int end = 0;
            while (start >= end) {
                int mid = (start + end)/2;
                if (arr[mid] == target) {
                    return target;
                } else if (arr[mid] > target) {
                    end = mid + 1;
                } else {
                    start = mid - 1;
                }
            }
        }

        return 0;
    }
}
