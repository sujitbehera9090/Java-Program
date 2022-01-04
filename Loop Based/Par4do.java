
import java.io.*;

class Par4do{

    public static void main( String arg[] ){

        int i = 700;

        do{

            if( i % 2 != 0 ){

                System.out.println( i + "\n" );

            }

            i--;

        }

        while( i >= 500 );

    }

}