package Conditional_statment;

import java.util.*;
public class Largest_Of_Three_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 =  sc.nextInt();

        System.out.println("Enter the second number ");
        int num2 =  sc.nextInt();

        System.out.println("Enter the third number ");
        int num3 =  sc.nextInt();

        if( (num1 > num2) && (num1 > num3 ) )
        {
            System.out.println("First number is the largest number " + num1);
        }
        else if( (num2 > num1) && (num2 > num3 ) )
        {
            System.out.println("Second numbe ris the largest number " + num2 );
        }

        else if((num3 > num1) && (num3 > num2) )
        {
            System.out.println("Third number is the largest number " + num3);
        }
        
        else
        {
            System.out.println("Not defined value is entered ");
        }

    }
    
}
