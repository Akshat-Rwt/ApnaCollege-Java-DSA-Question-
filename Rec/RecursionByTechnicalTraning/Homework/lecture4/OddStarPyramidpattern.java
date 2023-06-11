package Recursion.Homework.lecture4;

public class OddStarPyramidpattern {
    public static void OddStarPyramidPatternloop(int num){
        for(int i = 0 ; i <= num ; i ++){
            for(int j = 0 ; j <= num -i ; j++){               
                    System.out.print(" ");
            }
            for(int k = 0 ; k <(i*2)+1 ; k++){
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
        int j = 0 ;
        if(currentrow == 0 ){
            return ;

        }
        if(currentrow >= j){
            System.out.print("*");
        }
        printStar(currentrow -1);
    }
    public static void OddStarPyramidPatternRec(int row ,int currentrow){
        if(row == 0){
            return ;
        }


        printSpace(row);
        printStar(currentrow);
        System.out.println();
        OddStarPyramidPatternRec(row-1, currentrow+1);
    } 


    public static void main(String[] args) {
       // int num = 5 ;
       // OddStarPyramidPatternloop(num);

        int row = 5;
        int currentrow = 1 ;
        OddStarPyramidPatternRec(row, currentrow);
    }
    
}
