package Recursion.Homework.lecture4;

public class InvertedHalfPyamid {
    public static void leftPyramidPatternloop(int num){
    for(int i = 1 ; i <= num ; i ++ ){
        for(int j = i ; j <= num; j ++){
            System.out.print("*");
        }
        System.out.println();
    }

}

    public static void printpattern(int currentrow ,int row){
        
        if(currentrow == 0){
            return ;
        }
        if(currentrow >= row){
            System.out.print("*");

        }
        printpattern(currentrow-1 , row);
    }
    public static void leftPyramidPatternRec(int row , int cureentrow){
        if(cureentrow == 0){
            return ;
        }
        

        printpattern(cureentrow , row);
        System.out.println();
        leftPyramidPatternRec(row, cureentrow-1);

    }

    public static void main(String[] args) {
        // int num = 5 ;
        // leftPyramidPatternloop(num);

        int row = 1 ;
        int cureentrow = 5 ;
        leftPyramidPatternRec(row , cureentrow);

    }

}
