public class Function_Overloading_Using_Datatypes {
    
    //Function add two integer numbers
    public static int sum (int a , int b ){
        return (a+b);
    }

    //Function add 2 float numbers 
    public static float sum (float a , float b ){
        return (a+b);
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2f,3f));
    }
    
}
