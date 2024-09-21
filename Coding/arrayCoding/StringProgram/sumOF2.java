package com.Coding.arrayCoding.StringProgram;

public class sumOF2 {
    public static void main(String[] args) {
        int[] randomArray= {2,-1,3,-4,1,};
        for(int i = 0 ; i <randomArray.length ; i++){
            int a= randomArray[i];

            for(int j =i+1; j< randomArray.length ; j++){
                if(a+randomArray[j]==2){
                    System.out.println(i+" : "+j);
                    System.out.println(a+randomArray[j]);
                    System.out.println("yes");
                    break;
                }


            }
        }
    }
}
