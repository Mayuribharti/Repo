package com.Coding.arrayCoding;

public class OddPositionElementInArray {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,8};
        System.out.println(arr[0]);
        for(int i =1 ; i<arr.length ; i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
