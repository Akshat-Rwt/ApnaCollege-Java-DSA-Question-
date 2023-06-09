package Bit_Manupulation;

import java.util.Set;

public class Count_Set_Bits {
    public static int CountSetBits(int n ){
        int count  = 0 ;
        while(n > 0){
            if((n & 1) != 0){
                count ++ ;
            }
            n = n >> 1 ;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountSetBits(15));
    }
}
