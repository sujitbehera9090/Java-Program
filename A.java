
import java.io.*;
import java.util.*;

public class A{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if( n % 2 == 0){

            if( n >= 2 && n <= 5 ){

                System.out.println("Not Weird");

            }

            else if( n >= 6 && n <= 20){

                System.out.println("Weird");

            }

            else if( n > 20 ){

                System.out.println("Not Weird");

            }

        }

    }
    
}