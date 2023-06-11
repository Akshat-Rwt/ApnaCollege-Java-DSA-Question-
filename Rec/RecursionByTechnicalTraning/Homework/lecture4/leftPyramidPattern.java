package Recursion.Homework.lecture4;

import java.util.Currency;

public class leftPyramidPattern {
public static void leftPyramidPatternloop(int num){
    for(int i = 1 ; i <= num ; i ++ ){
        for(int j = 1 ; j <= i; j ++){
            System.out.print("*");
        }
        System.out.println();
    }

}

    public static void printpattern(int currentrow){
        int j = 1;
        
        if(currentrow == 0){
            return ;
        }
        if(j <= currentrow){
            System.out.print("*");

        }
        printpattern(currentrow-1);
    }
    public static void leftPyramidPatternRec(int row , int cureentrow){
        if(row == 0){
            return ;
        }

        printpattern(cureentrow);
        System.out.println();
        leftPyramidPatternRec(row-1, cureentrow +1);

    }

    public static void main(String[] args) {
       // int num = 5 ;
    // leftPyramidPatternloop(num);

        int row = 5 ;
        int cureentrow = 1 ;
        leftPyramidPatternRec(row , cureentrow);

    }
}
