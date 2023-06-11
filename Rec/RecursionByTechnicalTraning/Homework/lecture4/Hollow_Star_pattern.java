package Recursion.Homework.lecture4;

import java.util.Currency;

public class Hollow_Star_pattern {

    public static void printpatternloop(int num){

        for(int i = 1 ; i <= num; i++) {
            for(int j = 1 ;j<= num ; j++){
                if( j == 1 || j == num || i == 1 || 1 == num  ){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    

    public static void printHollowStarPattern(int rows, int cols) {
        printPattern(rows, cols, 0, 0);
    }

    public static void printPattern(int rows, int cols, int currentRow, int currentCol) {
        if (currentRow == rows) {
            return;
        }

        if (currentCol == cols) {
            System.out.println();
            printPattern(rows, cols, currentRow + 1, 0);
            return;
        }

        if (currentRow == 0 || currentRow == rows - 1 || currentCol == 0 || currentCol == cols - 1) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }

        printPattern(rows, cols, currentRow, currentCol + 1);
    }


    public static void main(String[] args) {
      //  int num= 5 ;
      //   printpatternloop(num);

     int rows = 5;
    int cols = 5;
    printHollowStarPattern(rows, cols);
    }
    
}

     
    
