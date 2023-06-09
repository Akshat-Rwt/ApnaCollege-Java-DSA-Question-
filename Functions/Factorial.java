import java.util.Scanner;

public class Factorial {

    public static int factorial(int a ){
        int f = 1;
        for(int i = 1  ; i <= a ; i ++){
             f = f * i;            
        }
        return f; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
    }
    
}
