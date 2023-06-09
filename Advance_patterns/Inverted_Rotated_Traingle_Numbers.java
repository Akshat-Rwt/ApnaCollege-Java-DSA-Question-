package Advance_patterns;

public class Inverted_Rotated_Traingle_Numbers {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0 ; i <= n ; i ++){
            for(int j  = 1 ; j <= n; j ++){
                if(j <= n-i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
}
