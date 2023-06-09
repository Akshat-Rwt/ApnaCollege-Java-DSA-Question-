package Functions.Practise_question;

import java.util.*;
public class Palindrome {

    public static boolean ispalindrome(int n ){
        int myNum = n;
        int reverse =  0;
       
        while (n != 0){
            int rem = n % 10 ;
            reverse =  reverse * 10 + rem ;
            n = n / 10 ;
        }

        if(myNum == reverse){
            return true;
        }

        else{
            return false ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int palindrome = sc.nextInt();

        if( ispalindrome (palindrome)){
            System.out.println("Yes it is palindorme " + palindrome);
        }
        else{
            System.out.println("Not a palindrome " + palindrome);
        }
    }

    
}
