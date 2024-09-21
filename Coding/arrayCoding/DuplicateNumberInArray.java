package com.Coding.arrayCoding;

public class DuplicateNumberInArray {
    public static void main(String[] args) {

    int arr[] = {4,2,5,13,1,1,7};
    for(int i =0 ; i< arr.length ; i++){
        for(int j = i+1 ; j< arr.length ; j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
            }
        }
    }
    }
}
