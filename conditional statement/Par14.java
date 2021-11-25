
import java.io.*;

import java.util.*;

public class Par14 {

    public static void main( String arg[] ){

        Scanner sc = new Scanner( System.in );

        int num;

        System.out.print("Enter a number: ");

        num = sc.nextInt();

        if( num > 0 ){

            System.out.println( num + " is a positive number.");

        }

        else if( num < 0 ){

            System.out.println(  num + " is a negative number." );

        }

        else if( num == 0 ){

            System.out.println("Zero.");

        }

    }
    
}
