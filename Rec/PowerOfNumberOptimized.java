package Rec;

public class PowerOfNumberOptimized { // TIME COMPLEXICITY O(logn)

    public static int optimizedPower(int a , int n){

        if(n == 0){
            return 1;
        }


        int halfpower = optimizedPower(a, n/2);
        int halfpowerSq = halfpower * halfpower ;

        if( n % 2 != 0){
            halfpowerSq = a * halfpowerSq ;
        }

        return halfpowerSq;
    }
    public static void main(String[] args) {
        int a  = 2 ;
        int n = 5;
         System.out.println(optimizedPower(a, n));
    }
}
