
import java.io.*;

import java.util.*;

class Par13 {

    public static void main( String arg[] ){

        Scanner sc = new Scanner( System.in );

        System.out.print("Enter mark: ");

        int mark = sc.nextInt();

        if( mark >= 90 && mark <= 100 ){

            System.out.println("Outstanding.");

        }

        else if( mark >= 80 && mark < 90 ){

            System.out.println("Excellent.");

        }

        else if( mark >= 70 && mark < 80 ){

            System.out.println("Very Good.");

        }

        else if( mark >= 60 && mark < 70 ){

            System.out.println("Good.");

        }

        else if( mark >= 50 && mark < 60 ){

            System.out.println("Bad.");

        }

        else if( mark < 50 ){

            System.out.println("Fail !!!.");

        }
    }

}
