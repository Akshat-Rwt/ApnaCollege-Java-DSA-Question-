package Recursion;

public class PrimeNumber {

    static boolean isPrimeloop(int n ){
       boolean t = true ;
        for(int i = 2 ; i <= (n/2) ; i++){
        if(n % i == 0){
            t = false;
            break;
        }
        
       }
       if(t == false   ){
        return  false  ;
       }
       else{
        return true ;
       }
    }

    static boolean isPrimeRec(int n, int i)
    {
        
        if (n <= 2) 
           return (n == 2) ? true : false; 
       if (n % i == 0) 
           return false; 
       if (i * i > n)

            return true;
        
        return isPrimeRec(n, i + 1);
    }
    public static void main(String[] args) {
        System.out.println(isPrimeloop(5));
        System.out.println(isPrimeRec(5 , 2));
    }

    
}
