

import java.io.*;
import java.util.*;

class Palindrome_number{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int num , palindrome = 0 , original;

        System.out.print("Enter a number: ");

        num = sc.nextInt();

        original = num;

        while( num != 0){

            palindrome = ( palindrome * 10 ) + num % 10 ;

            num = num / 10;

        }

        if( palindrome == original ){

            System.out.println("Palindrome Number");

        }

        else{

            System.out.println("Not a palindrome number");

        }
    }
}