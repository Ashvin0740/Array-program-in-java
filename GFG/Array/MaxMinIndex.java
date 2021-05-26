import java.io.*;
import java.util.*;

class MaxMinIndex {

    static int getMin( int arr[] , int n){
         int res = arr[0];

         for(int i =0; i < n; i++)
             res = Math.min(res, arr[i]);
             return res;
         }
    
    static int getMax( int arr[] , int n){
        int res = arr[0];

        for(int i =0; i < n; i++)
            res = Math.max(res, arr[i]);
            return res;
        }
   

   public static void main(String[] args) {
       int arr[] = {12,45,98,75,84,96,54,21,25,47,65,11,22,44,22,55,78,8,55,22,55,54,2,23,52,5,134};
       int n = arr.length;

       System.out.println(getMax(arr, n));
       System.out.println(getMin(arr, n));

   }

}