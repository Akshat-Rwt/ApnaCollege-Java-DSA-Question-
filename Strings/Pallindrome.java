package Strings;

import java.util.Scanner;

public class Pallindrome {

    public static boolean isPallindrome(String str){
        int n = str.length();
        for(int i  = 0 ; i < str.length()/2 ; i++ ){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
            else{
                return true ;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String name = sc.nextLine();
        System.out.println(isPallindrome(name));
    }
    
}
