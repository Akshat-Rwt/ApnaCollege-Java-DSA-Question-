package Bit_Manupulation;

public class Check_Number_power_Of_2 {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0; 
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
    
}
