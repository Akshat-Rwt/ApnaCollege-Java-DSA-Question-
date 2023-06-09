package Loops.While_Loop;
import java.util.*;
public class Sum_Of_First_N_Numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int n = sc.nextInt(); 
        
        int counter = 1;
        int sum = 0;

        while (counter <= n )
        {
        sum = sum + counter ;
        counter++ ;
        }

        System.out.println(sum);

    }
    
}
