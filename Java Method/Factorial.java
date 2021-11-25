

import java.io.*;

import java.util.*;

class Factorial{

    private int fact = 1;

    public int factorial_method( int num ){

        for( int i = 1 ; i<=num; i++){

            fact = fact * i;

        }

        return fact;  

    }

    public static void main(String arg[]){

        Factorial fc = new Factorial();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is " + fc.factorial_method(num) );


    }

}

