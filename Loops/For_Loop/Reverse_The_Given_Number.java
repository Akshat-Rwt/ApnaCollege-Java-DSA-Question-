package Loops.For_Loop;

import java.util.*;
public class Reverse_The_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int rev = 0 ;

        while (num > 0){
            int lastdig = num % 10 ;
            rev = (rev*10) + lastdig;
            num =  num /10;


        }
        System.out.println(rev);

    }
    
}
