package com.company;

import java.util.Scanner;

public class SearchInRSAWithDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("We are searching in RSA with duplicates:");
        System.out.println("It is difficult to find the pivit in duplicates");
        int []a ={2,2,2,2,2,2,9,1};
        int pivit = PivitWithDuplicates(a);
        if (pivit!=-1)
        {
            System.out.println("We find the pivit at index "+pivit+" and element is "+a[pivit]);
            System.out.println("Number of rotation in RSA are : " + (pivit+1));
        }
        else
            System.out.println("Array is not rotated:");

    }
    public static int PivitWithDuplicates(int[]a)
    {
        int start=0;
        int end= a.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if( end > mid && a[mid] > a[mid+1])
                return mid;
            if( start <mid && a[mid-1] > a[mid])
                return (mid-1);
            // now the twist arises
            // if element at mid, start,end are equal then just remove the duplicates
            // i.e start and end
            if (a[start] == a[mid] && a[end] == a[mid])
            {
                //removing start and end
                // NOTE: what if these start and end are the pivit
                //checking if start is pivit or not
                // if it is pivit , it will return start
                // otherwise remove start
                if (a[start] > a[start+1])
                    return start;
                start++;
                // checking if end is pivit or not
                if (a[end] < a[end-1])
                    return (end-1);
                end--;
            }
            // left side is sorted , pivit should be in right
            else if (a[start] < a[mid] || a[start] == a[mid] && a[mid] > a[end])
                start= mid+1;
            else
                end = mid-1;

        }
        return -1;
    }
}
