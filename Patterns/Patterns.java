package Patterns;

public class Patterns {
    public static void main(String[] args) {
        for(int lines = 1 ; lines <= 4 ; lines++){
            for(int star = 1 ; star <= lines ; star++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
