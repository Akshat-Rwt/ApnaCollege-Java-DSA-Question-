package Recursion.Homework.lecture4;

import javax.print.attribute.standard.PrinterStateReason;

public class MirrorLeftPyramidPattern {

    public static void MirrorLeftPyramidPatternloop(int num){
        for(int i = 1 ; i <= num ; i ++){
            for(int j = 1 ; j <= num -i ; j++){               
                    System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSpace(int row){
        if(row == 1){
            return ;
        }
        else{
            System.out.print(" ");
        }
        printSpace( row -1);
    }
    public static void printStar(int currentrow){
        int j = 1 ;
        if(currentrow == 0 ){
            return ;

        }
        if(currentrow >= j){
            System.out.print("*");
        }
        printStar(currentrow -1);
    }
    public static void MirrorLeftPyramidPatternRec(int row ,int currentrow){
        if(row == 0){
            return ;
        }


        printSpace(row);
        printStar(currentrow);
        System.out.println();
        MirrorLeftPyramidPatternRec(row-1, currentrow+1);
    } 


    public static void main(String[] args) {
        int num = 5 ;
        MirrorLeftPyramidPatternloop(num);

        //int row = 6;
        //int currentrow = 1 ;
        //MirrorLeftPyramidPatternRec(row, currentrow);
    }
}
