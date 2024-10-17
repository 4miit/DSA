 /*
 class Main {
    public static void main(String [] args ) {
        System.out.println("Hello, World!");
    }
}

*/

import java.util.Scanner;
public class concept {

    public static boolean isPrime(int n){

        if (n<=1){
            System.out.println("neither prime nor composite");
            return false;
        }

        for( int i = 2 ; i <= Math.sqrt(n) ; i++){
            if (n%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main ( String[] args){
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter Number");
         int number = scanner.nextInt();
        
          if( isPrime(number))
         System.out.println( number + "   is a prime number");
        else 
         System.out.println( number + "   is a Not prime number");
    }
}


