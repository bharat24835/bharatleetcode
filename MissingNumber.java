package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("We have enteres the array:");
        System.out.println("Enter the ordre of array");
        int n= in.nextInt();
        int []a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(a));
        Missing(a);

    }
    public static void Missing(int []a)
    {
        Arrays.sort(a);
        int start=0;
        int end= a.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(a[mid]==mid)
                start= mid+1;
            else
                end = mid-1;

        }
        System.out.println("The missing number is :" + (end+1));
    }
}
