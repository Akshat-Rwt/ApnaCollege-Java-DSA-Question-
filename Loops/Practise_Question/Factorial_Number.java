package Loops.Practise_Question;

import java.util.*;
public class Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 1;

        for(int i = 1 ; i <= n ; i++ ){
            sum = sum * i;
            
        }
        System.out.println("Factorial number " + sum );
    }
    
}
