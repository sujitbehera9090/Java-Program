

import java.io.*;
import java.util.*;

class Prime_number{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int num , counter = 0;

        System.out.print("Enter a number: ");

        num = sc.nextInt();

        for( int i = 1 ; i <= num; i++ ){

            if( num % i == 0){

                counter++;

            }
        }

        if( counter == 2){

            System.out.println("Prime Number");

        }

        else{

            System.out.println("Not a Prime number");

        }
    }
}
