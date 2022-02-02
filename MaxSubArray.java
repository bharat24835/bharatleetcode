package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Here we are trying to find maximum subarray:");
        int []a = {-2, 1, -3, -1 , -1, 2, 1, 5, 4};
        System.out.println(Arrays.toString(a));

        int max= Integer.MIN_VALUE;
        int sum=0;
        MSubArray(a, sum , max );

    }
    public  static  void MSubArray(int []a, int sum, int max)
    {ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            sum= sum + a[i];
            max= Math.max(max , sum );
            if(sum <0)
            sum=0;
            if(sum>0)
                list.add(max);

        }
       // System.out.println(list);
        System.out.println(" The MAX Sum is :" + max);
    }
}
