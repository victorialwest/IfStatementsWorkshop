
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


        /* A school has following rules fro grading system:
        a. Below 45 - F
        b. 45 to 50 - D
        c. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
         */



        System.out.println("Enter your grade:");
        int userGrade = input.nextInt();

        if (userGrade < 45)
            System.out.println("You have an F.");

        else if(userGrade >= 45 && userGrade <= 49)
            System.out.println("You have a D.");

        else if(userGrade >=50 && userGrade <= 59)
            System.out.println("You have a C.");

        else if(userGrade >= 60 && userGrade <= 80)

            System.out.println("You have a B.");
        
        else {
            System.out.println("You have an A.");
        }













    }
}
;