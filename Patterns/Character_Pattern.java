package Patterns;

public class Character_Pattern {
    public static void main(String[] args) {
        
        char ch = 'A';
        for(int lines = 1 ; lines <= 5 ; lines++)
        {
            for(int chars = 1 ; chars <=lines ; chars ++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
