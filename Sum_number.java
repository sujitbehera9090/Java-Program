
import java.io.*;
import java.util.*;
class Sum_number{

    public static void main(String arg[]){

        int num  , sum = 0;

        System.out.println("Enter a number: ");

        Scanner sc = new Scanner(System.in);

        sc.num = nextInt();

        while( num != 0 ){

            sum = sum + ( num % 10 );

            num = num / 10;

        }

        System.out.println("Sum of " + num + " is: " + sum);

    }
}