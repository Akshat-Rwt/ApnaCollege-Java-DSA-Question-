package Bit_Manupulation;


public class Check_Odd_Or_Even {
    public static void OddOrEven(int n ){
        int bitmask = 1 ;
        if((n & bitmask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number ");
        }
    }
    public static void main(String[] args) {
        OddOrEven(1);
        OddOrEven(4);
        OddOrEven(10);     
    }
    
}
