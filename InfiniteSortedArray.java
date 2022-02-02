package com.company;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []a = {1,3,5,7,9,12,15,17,19,21,25,32,37,39,42,49,54,59,65,79,84,91,97};
        System.out.println("Enter the target array:");
        int[] b = new int[2];
        int target = in.nextInt();
        // searching for the size of the box
        // in which we have to apply BS
        int start= 0;
        int end= 1;

        while(a[end] < target )
        {
            int temp= start;
            start = end+1;
            end = end + (end - temp +1 )*2;
            // basic end - (start-1)
            if(end> a.length)
                end=a.length-1;

        }

        System.out.println("start = : " + (start+1));
        System.out.println("end = : " + (end+1));
        BinarySearch(a, target, start , end);
    }

    public static void BinarySearch(int []a, int target, int start, int end)
    {
        System.out.println("Start is " + start);
        System.out.println("End  is " + end);

        while (start <= end)
        {
            int mid= start + (end - start)/2;
            if(a[mid] > target)
                end= mid-1;
            else if (a[mid] < target)
                start = mid+1;
            else
            {
                System.out.println("Here we got the numebr at index :" + mid);
             break;
            }
        }

    }
}
