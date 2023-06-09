package Conditional_statment.Practise_Question;

import java.util.*;
public class Check_Temperature {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the temperature");
       float temp = sc.nextFloat();

       if(temp >= 100){
        System.out.println("You have fever");
       }
       else{
        System.out.println("You donot have fever");
       }
    }
    
}
