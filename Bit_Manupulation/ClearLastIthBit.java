package Bit_Manupulation;

public class ClearLastIthBit {
    public static int ClearLastIthBit(int n , int i ){
        int bitmask = (~0)<< i;
        return n & bitmask ;
    }
    public static void main(String[] args) {
        System.out.println(ClearLastIthBit(15, 2));
    }
    
}
