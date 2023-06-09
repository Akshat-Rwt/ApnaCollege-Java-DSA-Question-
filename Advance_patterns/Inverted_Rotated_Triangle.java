package Advance_patterns;

import javax.management.openmbean.SimpleType;

public class Inverted_Rotated_Triangle {
    public static void main(String[] args) {
        int n = 4 ;
        for(int i = 1 ; i <=n ; i ++){
            for(int j = 1; j <= n ; j ++){
                if( j <= n- i ){
                    System.out.print(" ");

                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
}
