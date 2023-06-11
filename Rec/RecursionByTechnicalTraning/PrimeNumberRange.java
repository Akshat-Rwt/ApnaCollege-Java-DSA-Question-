package Recursion;

public class PrimeNumberRange {
    public static int prime (int start , int end){
    for(int i  = start ; i < end ; i ++){
         isPrimeRec(i, i);
         System.out.println(i);
    }
    return end;

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
        System.out.println(prime(3,10));      
        
    }
    
}
