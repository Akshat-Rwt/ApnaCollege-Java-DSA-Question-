package Recursion;

public class PowerComputer {
    static int powerSUsingLoop(int n , int pow){
        int result  = 1; 
        for(int i = 1 ;i <= pow ; i ++){
            result = result * n ;

        }
        return result ;

    }
    
    static int powerUsingRecursion(int n , int  pow){

        if(pow == 0 ){
            return 1 ;
        }
        int res = powerUsingRecursion(n, pow -1);
        res = res * n;
        return res ;
    }

    public static void main(String[] args) {
        int n = 2 ;
        int pow = 5 ;

        System.out.println(powerSUsingLoop(2,5));
        System.out.println(powerUsingRecursion(2, 5));
    }
}
