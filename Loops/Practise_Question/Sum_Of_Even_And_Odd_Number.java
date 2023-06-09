package Loops.Practise_Question;

import java.util.*;
public class Sum_Of_Even_And_Odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many times you want to run a loop");
        int n = sc.nextInt();
        int sum_even = 0 ;
        int sum_odd = 0 ;

        for(int i = 1 ; i <= n; i++){
            if ( i % 2 == 0){
                sum_even = sum_even + i;
            }
            else {
                sum_odd = sum_odd + i ;
            }
        }
        System.out.println("Sum of even number " + sum_even);
        System.out.println("Sum of odd number " + sum_odd);
    }
    
}
