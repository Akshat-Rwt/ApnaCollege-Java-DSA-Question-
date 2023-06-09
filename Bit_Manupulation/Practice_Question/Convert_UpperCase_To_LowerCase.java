package Bit_Manupulation.Practice_Question;

public class Convert_UpperCase_To_LowerCase {
    
        public static void main(String[] args) {

        // Convert uppercase character to lowercase

        for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.print((char)(ch | ' '));
        
        }
        
    }
        
    
}
