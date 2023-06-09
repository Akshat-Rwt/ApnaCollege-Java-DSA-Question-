package Conditional_statment;

public class Else_If_Statement {
    public static void main(String[] args) {
        int age =  18 ;
        
        if(age >= 18 )
        {
            System.out.println("Adult ");
        }

        else if (age > 13 && age < 18)
        {
            System.out.println("Tennager");
        }

        else
        {
            System.out.println("Child");
        }
    }
    
}
