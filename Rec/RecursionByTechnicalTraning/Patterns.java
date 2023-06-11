package Recursion;

public class Patterns {
    static void printStar(int noOfStar){
        //Base case 
        if( noOfStar == 0){
            return ;
        }
        System.out.print("*");
        printStar(noOfStar - 1);
    }
    static void printPatten(int rows ,int currentrows){
        if(rows == 0){
            return ;
        }
        printStar(currentrows);
        System.out.println();
        printPatten(rows-1 , currentrows +1);
    }

    public static void main(String[] args) {
        printPatten(5, 1);
    }
    
}
