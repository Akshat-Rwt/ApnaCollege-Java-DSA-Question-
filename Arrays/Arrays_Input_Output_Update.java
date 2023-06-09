

import java.util.*;
public class Arrays_Input_Output_Update {
    public static void main(String[] args) {
        
        int marks[] = new int[100];

        //To find lenght of an array 
        System.out.println("Lenght of an array is : " + marks.length);

        //Input of an array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the phys number : ");
        marks[0] = sc.nextInt();  //Phys

        System.out.println("Enter the Chem number : ");
        marks[1] = sc.nextInt();  // Chem
        
        System.out.println("Enter the Maths number : ");
        marks[2] = sc.nextInt();  // Maths
        
        System.out.println("Phys : "+ marks[0]);
        System.out.println("Chem : "+ marks[1]);
        System.out.println("Maths : "+ marks[2]);

        //Percentage of marks
        int percenatge = (marks[0] + marks[1] + marks[2])/ 3;
        System.out.println("Percentage : " + percenatge + "%");
    }
    
}
