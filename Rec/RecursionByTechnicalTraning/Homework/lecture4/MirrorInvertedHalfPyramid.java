package Recursion.Homework.lecture4;

public class MirrorInvertedHalfPyramid {
    public static void  MirrorInvertedHalfPyramidloop(int num){
    for(int i = 1 ; i <= num ; i ++ ){
        for(int j = 0 ; j <= i; j ++){
            System.out.print(" ");
        }
        for(int k = i ; k <= num ; k ++){
            System.out.print("*");
        }
        System.out.println();
    }

}

    public static void printSpaces(int row){
        if( row == 0){
            return ;
        }
        if(row > 0 ){
            System.out.print("*");
        }
        printSpaces(row-1);
    }

    public static void printpattern(int currentrow ){
        
        if(currentrow == 1){
            return ;
        }
        if(currentrow > 1 ){
            System.out.print(" ");

        }
        printpattern(currentrow-1 );
    }
    public static void  MirrorInvertedHalfPyramidRec(int row , int cureentrow){
        if(row == 0){
            return ;
        }
        
        printpattern(cureentrow);
        printSpaces(row);
        System.out.println();
         MirrorInvertedHalfPyramidRec(row -1, cureentrow + 1);

    }

    public static void main(String[] args) {
       // int num = 6 ;
        // MirrorInvertedHalfPyramidloop(num);

        int row = 5 ;
        int cureentrow = 1 ;
        MirrorInvertedHalfPyramidRec(row , cureentrow);

    }
}
