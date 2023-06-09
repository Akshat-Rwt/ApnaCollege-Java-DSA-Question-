package Loops;

import java.util.*;

public class Display_All_Number_Except_Multiple_Of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue ;
            }
            System.out.println(n);

        }
    }
    
}
