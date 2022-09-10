package com.sol;

public class Solution {
    public static long getTrappedWater(long[] arr) {
        int n = arr.length;
        if(arr.length <=2 )
            return 0L;
        long leftMax[] = new long[n];
        long rightMax[] = new long[n];

        long leftMaxVar = arr[0];
        leftMax[0] = arr[0];
        // System.out.println("left max");
        for(int i =1;i<n;i++){
            if(leftMaxVar < arr[i]){
                leftMaxVar = arr[i];

            }
            //System.out.print(leftMaxVar+ " ");
            leftMax[i] = leftMaxVar;
        }

        long rightMaxVar = arr[n-1];
        rightMax[n-1] = arr[n-1];
        System.out.println("right max");
        for(int i =n-2;i>=0;i--){
            if(rightMaxVar < arr[i]){
                rightMaxVar = arr[i];

            }
          //  System.out.print(rightMaxVar+ " ");
            rightMax[i] = rightMaxVar;
        }
        long area = 0;
        for(int i = 1;i<n-1;i++){

            long min = Math.min(leftMax[i-1],rightMax[i+1]);
            if(min > arr[i]){
                area = area + (min - arr[i]);
            }
        }
        return area;
    }

    public static void main(String[] args) {
        long arr[] = new long[]{0 ,1 ,0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
         System.out.println(getTrappedWater(arr));
    }
}