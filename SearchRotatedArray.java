package com.company;

import java.util.Scanner;

public class SearchRotatedArray {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Entered the array:");
        int []a = {4,5,6,7,0,1,2,3};
        System.out.println("Enter the target:");
        int target = in.nextInt();
        System.out.println("We wish to find the pivit:");
        int pivit= Pivit(a);
       int index =  Search(a, target , pivit);
        System.out.println("Index of searched element in Rotated Sorted Arrray is:" + index);


    }
      static  int Pivit(int [] a )
    {   int start= 0;
        int end= a.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if( mid < end  && a[mid] > a[mid+1] )
                return mid;
            if ( start < mid && a[mid] < a[mid-1])
                return mid-1;
            if(start > a[mid])
                end= mid-1;
            else
                start = mid +1;

        }
        return -1;
    }
     static int Search(int [] a ,int target, int pivit)
    {
        if (pivit == -1)
            return BS (a, 0 , a.length-1, target);
        if (a[pivit] == target)
            return pivit;
        if(a[0] > target) // we search in array 2 after pivit
            return  BS(a,(pivit+1) , a.length-1, target);
            else // we search in array 1 befor pivit
                return BS( a, 0 , (pivit-1), target);
    }
    static int BS(int []a , int start , int end, int target)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if (a[mid] == target)
                return mid;
            else if(a[mid] > target)
                end = mid-1;
            else
                start = mid+1;

        }
        return  -1;
    }
}
