package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {-22, -15, 1, 7, 20, 35, 55};


        int result = binarySearch(arr,0,arr.length,55);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        int mid = (start + end) / 2;

        int temp = arr[mid];
        System.out.println("Mid : "+mid);


        if(temp == target){
            return mid;
        }
        if(start>=end){
            return -1;
        }else if (target > temp){
            System.out.println("temp "+temp +" < target "+target);
            return binarySearch(arr,mid+1,end,target);
        }else{
            System.out.println("temp "+temp +" > target "+target);
            return binarySearch(arr, start, mid, target);
        }
    }
}
