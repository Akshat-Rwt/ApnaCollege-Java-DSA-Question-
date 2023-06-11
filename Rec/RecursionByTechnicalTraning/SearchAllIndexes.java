package Recursion ;
import java.util.Scanner;
public class SearchAllIndexes{
    static void armstongloop(int n ){
        int cubeSum = 0, num, r;
        
        num = n;
        while (num > 0)
        {
            r = num % 10;
            cubeSum = cubeSum + (r * r * r);
            num = num / 10;
        }
        if (n == cubeSum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }


    static int cubeSum = 0 , num ,  r ;
    static int  armstongRec(int n){
        
        num = n ;

        if(num > 0 ){
            r = num % 10;
            cubeSum = cubeSum + (r * r * r);
            num  = num /10 ;
            armstongRec(num);   
        }
        return cubeSum ;

        

    }
    public static void main(String[] args) {
        int n  =153; 
        armstongloop (n);       
         armstongRec (n);
         
        if (n == cubeSum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}