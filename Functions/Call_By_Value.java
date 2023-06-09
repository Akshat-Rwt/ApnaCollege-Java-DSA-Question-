package Functions;


public class Call_By_Value {

    public static void swap(int a, int b ){
        int temp = a ;
         a = b ;
         b = temp ;
    
        System.out.println("a is : " +a );
        System.out.println("b is : " +b );
    
    }
    public static void main(String[] args) {
        
        int a =  3; 
        int b = 4;

        swap(a, b);
    }
    
}
