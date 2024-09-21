package com.Coding.arrayCoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class
NumberOfOccurenceOfEachElement {

    public static void main(String[] args) {

        int a[] = {4,2,5,2,2,51,2,3,5,7};

       for(int i =0 ; i<a.length ; i++){
           int n= a[i];
           if(n==-1)continue;

           int count=0;
           for(int j =0 ; j<a.length ; j++){
               if(a[j]==n){
                   count++;
                   a[j]=-1;
               }
           }
           if(count>=1) {
               System.out.println(n);
           }
        }
    }

}
