package Conditional_statment;
import java.util.*;

public class Print_Number_Is_Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);    
        
        System.out.println("Enter the number ");
        int a =  sc.nextInt();

        if(a % 2 == 0){
            System.out.println("It is a even number ");
        }
        else{
            System.out.println("It is a odd number ");
        }
    }
    
}
