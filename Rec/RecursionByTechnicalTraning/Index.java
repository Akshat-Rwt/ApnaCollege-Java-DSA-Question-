package Recursion;

public class Index {
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

    static void printPatter4Rec(int currentrow  , int count  ){
        
        if(currentrow == 0 ){
            return ;
        }
        System.out.print(count);        
        printPatter4Rec(currentrow-1  , count +1);
    }
    static void pattern4Rec(int row , int currentrow  ,int count  ){
        if(row == 1){
            return ;
        }
        printPatter4Rec(currentrow , count );
              
        System.out.println();
        pattern4Rec( row-1, currentrow +1 , count+1 );
    }
    public static void main(String[] args) {
        int row = 5;
        int currentrow = 1;
        int count  = 1  ;
       // pattern4loop(row );
        pattern4Rec(row, currentrow ,count  );
        
    }
    
}
