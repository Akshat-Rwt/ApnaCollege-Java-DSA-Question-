package Recursion;

public class SumOfDigit {

    //Using loop
    static int sumUsingLoop(int n ){
        int sum = 0 ;
        while (n != 0 ){
            sum  += n % 10 ;
            n = n /10 ;
        }

        return sum ;

    }

    //Using Recursion 
    static int sumUsingRec(int n  , int sum){
        //terminating case 
        if(n == 0){
            return sum ;
        }
        //Processing logic 
            sum  += n % 10 ;

            //small Problem 
            n = n /10 ;
        

        return sumUsingRec(n , sum);
    }
    public static void main(String[] args) {
        System.out.println(sumUsingLoop(76));
        System.out.println(sumUsingRec(76, 0));
    }
    
}
