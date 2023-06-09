package Bit_Manupulation;

public class ClearIthBit {
    public static int ClearIthBit(int n , int i ){
        int bitmask = ~(1<<i);
        return n & bitmask ;
    }

    public static void main(String[] args) {
        System.out.println(ClearIthBit(10, 1));
    }
    
}
