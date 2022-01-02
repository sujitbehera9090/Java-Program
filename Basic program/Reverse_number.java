

import java.io.*;
import java.util.*;

class Reverse_number{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int reverse = 0;

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        while( num != 0 ){

            reverse = ( reverse * 10  ) + num % 10;

            num = num / 10;

        }

        System.out.println("Reverse is: " + reverse );

        
    }
}