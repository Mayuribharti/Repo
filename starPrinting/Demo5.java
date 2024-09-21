package com.starPrinting;

public class Demo5 {
    /*

        *
      * *
    * * *
  * * * *

     */








    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            for(int j=2*(4-i) ; j>=0 ;j--){
                System.out.print(" ");
            }

                for (int k = 1; k <= i; k++)
                {
                    System.out.print("* ");
                }
                System.out.println();

            }

        }
    }

