package Conditional_statment;

public class If_Else {
    public static void main(String[] args) {
        int age = 22 ;
        if(age >= 18){
            System.out.println("Adult : vote , drive ");
        }

        if(age >= 13 && age <= 18){
            System.out.println("Teenager");
        }

        else {
            System.out.println("Not adult ");
        }
    }
    
}
