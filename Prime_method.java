
import java.io.*;
import java.util.*;

class Prime_method{

    public int prime( int num){

        int n = num, counter = 0;

        for(int i = 1;i<=n;i++){

            if(n % i == 0){

                counter++;

            }
        }

        return counter;

    }

    public static void main(String arg[]){

        Prime_method pr = new Prime_method();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int counter = pr.prime( num );

        if(counter == 2){

            System.out.println("Yes");

        }

        else{

            System.out.println("No");

        }

    }
}