package Conditional_statment.Practise_Question;

import java.util.*;
public class Positive_Negative_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num =  sc.nextInt();

        if(num > 0){
            System.out.println("Its is a positive number");
        }

        else{
            System.out.println("Its is a negative number");
        }

    }
    
}
