package Recursion;

public class CountZeros {

    static int countZeroLoop(int n ){
        int count  = 0 ;
        int m ;
        while (n > 0){
            m = n % 10;
            if( m == 0){
                count ++ ;
            }
            n = n / 10;
                       
        }
        return count;
    }

    static int count  = 0 , m ;
    static int countZeroRec(int n ){
        if(n > 0){
            m = n % 10 ;
            if(m == 0){
                count ++ ;
            }   
            return (countZeroRec(n /10));
        }
        return count ;
               
    }
    public static void main(String[] args) {
        System.out.println(countZeroLoop(430203005));
        System.out.println(countZeroRec(430203005));
    }
    
}
