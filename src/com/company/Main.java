
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Fizzbuzz - Take user input of 1 - 100
        if it is a multiple of 3 output "Fizz"
        if it is a multiple of 5 output "Buzz"
        of it is a multiple of both output "FizzBuzz"
        if it is none of these output the user number

         */




        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 - 100:");
        int userNum = input.nextInt();

         if (userNum % 5 == 0 && userNum % 3 == 0 )
            System.out.println("FizzBuzz.");

        else if ( userNum % 3 == 0)
            System.out.println("Fizz.");

         else if (userNum % 5 == 0)
            System.out.println("Buzz.");

         else {
            System.out.println(userNum);
        }








    }
}
;