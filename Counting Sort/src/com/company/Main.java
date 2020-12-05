package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,5,9,8,2,8,7,10,4,3};

        countingSort(arr,1,10);

        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countingArray = new int[(max - min) + 1];
        for (int i=0 ;i<countingArray.length;i++){
            countingArray[input[i]-min]++;
        }
        int j =0;
        for( int i =min; i<=max;i++){
            while(countingArray[i-min]>0){
                input[j++] = i;
                countingArray[i-min]--;
            }
        }
    }
}
