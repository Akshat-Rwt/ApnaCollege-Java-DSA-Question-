package Loops;
import java.util.*;
public class Stop_Until_Multiple_Of_10_Entered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while (true ){
            System.out.println("Enter the number ");
            int n =  sc.nextInt();
            if(n % 10 == 0 ){
                break;
            }
            System.out.println(n);
        }
    }
    
}
