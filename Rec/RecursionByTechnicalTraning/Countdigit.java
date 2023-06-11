package Recursion;

public class Countdigit {
    static int countDigitloop(int n){
        int count  = 0 ;
        while ( n > 0 ){
            n = n / 10;
            count++;
        }
        return count;
    }

    static int count = 0 ;
    static int countDigitRec(int n ){
        if(n > 0 ){
        count++;
        countDigitRec(n / 10); 
        }
        
        return (count);
    }

    public static void main(String[] args) {
        System.out.println(countDigitloop(43235));
        System.out.println(countDigitRec(43235));
    }
    
}
