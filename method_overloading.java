
import java.io.*;

class method_overloading{

    int c , d;

    float e , f;

    public int sum( int a , int b){

        c = a;

        d = b;

        System.out.println("a : " + c);

        System.out.println("b : " + d);

        return a + b;

    }

    public void sum( float a , float b){

        e = a;

        f = b;

        System.out.println("a : " + c);

        System.out.println("b : " + d);

    }



public static void main(String arg[]){

    method_overloading m = new method_overloading();

    int d = m.sum( 12 , 45);

    m.sum( 12 , 45);

    System.out.println(" rrr" + d);

}

}
