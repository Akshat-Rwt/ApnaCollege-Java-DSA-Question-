package Loops.For_Loop;

public class Print_Reverse_Of_Number {
    public static void main(String[] args) {
        int number = 123456789;

        while (number > 0){
            int lastdigit = number % 10 ;
            System.out.print(lastdigit);

            number = number / 10;

        }
    }
    
}
