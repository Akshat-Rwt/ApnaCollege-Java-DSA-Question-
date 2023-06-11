package Recursion.Homework.lecture4;

public class Star_Square_pattern {

    public static void printstarLoop(int num){

        for(int i = 1 ; i <= num ; i++){
            for(int j = 1; j <= num ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

     static void printstar(int currentrow){
        int j = 6 ;
        if(currentrow == j){
            return ;
        }
        if(currentrow < j){
            System.out.print("*");
        }
        printstar(currentrow + 1 );
         
    }
    public static void selectrow(int row , int cureentrow){

        // Base Case 
        if(row == 0){
            return ;
        }
        printstar(cureentrow);
        System.out.println();
        selectrow(row-1, cureentrow);
    }

    public static void main(String[] args) {
        //int num = 5 ;
        //printstarLoop(num);

        int row = 5 ;
        int cureentrow = 1 ;
        selectrow(row  , cureentrow);
    }
    
}
