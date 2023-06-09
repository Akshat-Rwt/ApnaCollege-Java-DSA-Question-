package Strings ;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class  Strings{
    public static void main(String[] args) {
        
    char arr[] = {'a' , 'b' , 'c', 'd'};
    String str = "abcd" ; 
    String str2  = new String ("xyz@12345");

    Scanner sc =  new Scanner(System .in);
    // String name =  sc.next(); // sc.next() is use for only single word 
    // String name2 = sc.nextLine(); // sc.nextLine() is use for whole line . 
    
     // System.out.println(name);
    // System.out.println(name2);

   // String fullName = "Tony Stark";
   // System.out.println(fullName.length()); 

   String FirstName  = "Akshat" ;
   String LastName = "Rawat" ;
   String fullName = FirstName + " " + LastName;
   System.out.println(fullName);
    }
}