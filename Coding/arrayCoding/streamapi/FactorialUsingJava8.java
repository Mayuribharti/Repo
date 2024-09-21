package com.Coding.arrayCoding.streamapi;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactorialUsingJava8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       int fact = IntStream.rangeClosed(2,n).reduce(1,(a,b)->a*b);
        System.out.println("Fact :"+fact) ;
    }
}


/*
*
* Generate a stream of integers from 1 to 'n':
java
Copy code
IntStream.rangeClosed(1, n)
This line creates an IntStream containing integers from 1 to 'n', inclusive.
Perform reduction with the reduce() method:
java
Copy code
.reduce(1, (int a, int b) -> a * b)
This line reduces the elements of the stream using the given binary operator. Here's how it works:
Initial value ('a'): The 1 serves as the initial value for the reduction operation. It's represented by 'a' and acts as the starting point for the accumulation.
Current element ('b'): Each element of the stream is represented by 'b' in the lambda function (int a, int b) -> a * b. It represents the current element being processed in the stream.
Binary operator explained with 'a' and 'b':
The lambda function (int a, int b) -> a * b is the binary operator applied to each element of the stream. Here's how it operates:
Step 1 ('a' = 1, 'b' = 1): Start with the initial value 1. Multiply 'a' (1) by the first element of the stream ('b' = 1), resulting in 1.
Step 2 ('a' = 1, 'b' = 2): 'a' is now 1, and 'b' is the second element of the stream ('b' = 2). Multiply 'a' (1) by 'b' (2), resulting in 2.
Step 3 ('a' = 2, 'b' = 3): 'a' is now 2, and 'b' is the third element of the stream ('b' = 3). Multiply 'a' (2) by 'b' (3), resulting in 6.
Step 4 ('a' = 6, 'b' = 4): 'a' is now 6, and 'b' is the fourth element of the stream ('b' = 4). Multiply 'a' (6) by 'b' (4), resulting in 24.
Step 5 ('a' = 24, 'b' = 5): 'a' is now 24, and 'b' is the fifth element of the stream ('b' = 5). Multiply 'a' (24) by 'b' (5), resulting in 120.
Final result:
After iterating through all elements of the stream and performing the multiplication operations, the final result (factorial) is 120, which is the product of all integers from 1 to 'n'.
*
* */
