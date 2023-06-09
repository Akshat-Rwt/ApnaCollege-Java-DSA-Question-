package Loops;

import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");

        int num = sc.nextInt();

        if(num == 2 ){
            System.out.println("Its is a prime number ");
        }
        else{
            boolean isprime = true;
        for(int i = 2  ; i < num-1 ; i++){
            if(num % i == 0) // num is a multiple of i (i is not equal to num)
            {
                isprime = false ;
            }
        }

        if(isprime == true){
            System.out.println("It is a prime number " + num);

        }
        else{
            System.out.println("It is not a prime number "  + num);
        }
        }

    }
    
}
