package Functions;

import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class CalculateSum {
    public static int calculateSum(int num1 , int num2 ){ // paramters or formal parameters
        int sum = num1 + num2;
        return sum;
        
    }


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int a = sc.nextInt();

        System.out.println("Enter the number ");
        int b = sc.nextInt();

        int sum = calculateSum (a , b ); //Arguments and actual parameters
        System.out.println("Sum of two numbers is :" + sum);

    }
    
}
