package Rec;

public class FibonnaciSeries { // Multi branch recursion  
    public static void Fib(int n){
        int n1 = 0 , n2 = 1, n3 ;
        System.out.print(n1 + " ");
        System.out.print(n2+ " ");
        for(int i  = 1; i <=n ; i ++){
            n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2 ;
            n2 = n3;

        }
    }

    public static int  FibRec(int n){
        if(n == 0 || n == 1){
            return n ;
        }

        int fnm1 = FibRec(n-1); 
        int fnm2 = FibRec(n-2); 
        int fn = fnm1 + fnm2 ;
        return fn ;
        
    }
    public static void main(String[] args) {
        int number  = 4 ;
        System.out.print( FibRec(number)); 
    }
    
}
