
import java.io.*;
import java.util.*;

class Switchh{

    public static void main(String arg[]){

        int a ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        a = sc.nextInt();

        switch(a){

            case 1:
            System.out.println("Sujit");

            break;
            
            case 2:
            System.out.println("Aujit");

            break;
            case 6:
            System.out.println("Tujit");

            break;
            case 8:
            System.out.println("uujit");

            break;

            default:
            System.out.println("default");

        }
    }
}