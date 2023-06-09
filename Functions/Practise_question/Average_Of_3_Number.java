package Functions.Practise_question;

import java.util.Scanner;

public class Average_Of_3_Number {

    public static int avg(int a , int b , int c ){
        int avg = (a + b + c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 1st");
        int a  = sc.nextInt();
        
        System.out.println("Enter the number 2nd");
        int b  = sc.nextInt();

        System.out.println("Enter the number 3rd");
        int c  = sc.nextInt();
        System.out.println(avg(a,b,c));
    }
    
}
