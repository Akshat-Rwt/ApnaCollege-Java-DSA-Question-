package Recursion;

public class Pattern4 {

    static void pattern4loop(int row  ){
        int count  =1 ;
        for(int i = 0 ; i <= row ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(count);
                count ++ ;
            }
            System.out.println();
        }
    }

    static int printPatter4Rec(int currentrow  , int count  ){
        
        if(currentrow == 0 ){
            return count ;
        }
        System.out.print(count+ " ");        
        return printPatter4Rec(currentrow-1  , count +1);
    }
    static void pattern4Rec(int row , int currentrow  ,int count  ){
        if(row == 0){
            return ;
        }
       count =  printPatter4Rec(currentrow , count );
              
        System.out.println();
        pattern4Rec( row-1, currentrow +1 , count );
    }
    public static void main(String[] args) {
        int row = 4;
        int currentrow = 1;
        int count  = 1  ;
       // pattern4loop(row );
        pattern4Rec(row, currentrow ,count  );
        
    }
    
}
