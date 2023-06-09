package Bit_Manupulation;

public class SetIthBit {
    public static int SetIthBit(int n , int i){
        int bitmask = 1 << i ;
        return n | bitmask ;
    }

    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
    
}
