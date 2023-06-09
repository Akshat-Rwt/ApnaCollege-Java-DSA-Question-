package Advance_patterns;

import java.util.*;
public class Hollow_patterns {

    public static void Hollow_Rectangle(int rows , int columns ){
        for(int i = 1 ; i <= rows ;i ++){
            for(int j = 1 ;  j <= columns ; j++){
                if (i == 1 || j == 1 || i == rows  || j == columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total rows  ");
        int rows=  sc.nextInt();

        System.out.println("Enter the total columns  ");
        int columns =  sc.nextInt();
              

        Hollow_Rectangle(rows , columns);
        
    }
    
}
