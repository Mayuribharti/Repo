package com.Coding.arrayCoding;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {

        int arr[] = {4, 2, 6, 6, 1, 2, 3, 6, 8,};

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x == -1) continue;

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (x == arr[j]) {
                    count++;
                    arr[j]=-1;
                }
            }

            if (count >= 1) {
                System.out.println(x);
            }


        }
























  /*      int a[]={1,3,2,5,6,1,6,8,8,2,1,4};
        List<Integer> removeDuplicate = new ArrayList<>();

        for(int i =0 ; i< a.length ; i++){
                int x=a[i];
                if(x==-1)continue;
                int count=0;
            for(int j =0 ; j<a.length ; j++){
                if(x==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            if(count>=1){
                removeDuplicate.add(x);
            }
        }
        System.out.println(removeDuplicate);
*/

    }
}
