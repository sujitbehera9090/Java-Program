

#include<stdio.h>

int main(){

    int a = 10 , b = 15 , c = 55 , d = 14;

    if(a > b){

        if( a > c){

            if( a > d){

                printf("A is greater");

            }

            else{

                printf("D is greater");

            }
        }

        else{

            if ( c > d)
            {

                printf("c is greater");
                
            }

            else{

                printf("D is greater");
            }
            
        }
    }

    if ( b > c)
    {
        if (b > d)
        {
            printf("b is greater");
        }

        else
        {
            printf("D is greater");
        }
        
        
    }

    else{

        if (c > d)
        {
            printf("C is greater");
        }

        else{

            printf("D is greater");
        }
        
    }
    
}