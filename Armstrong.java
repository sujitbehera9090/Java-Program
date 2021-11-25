
import java.io.*;

import java.util.Scanner;

class Armstrong{

 public static void main(String[] args) {

    int num , r , armstrong = 0 , n;

    System.out.print("Enter a number");

    Scanner sc = new Scanner(System.in);

    num = sc.nextInt();

    n = num;

    while( num != 0){

        r = num % 10;

        armstrong = armstrong + ( r * r * r );

        num = num / 10;

    }

    if( armstrong == n){

        System.out.print( n + "  Number is a armstrong number");

    }

    else{

        System.out.println( n + " Number is not a armstrong number");

    }



        
    }
}