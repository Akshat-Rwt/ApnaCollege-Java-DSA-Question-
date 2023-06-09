public class Function_Overloading_Using_Paramters {
    
    //function of sum of 2 numbers 
    public static int sum (int a , int b ){
        return (a+b);
    }

    //Function of sum of 3 numbers 
    public static int sum(int a , int b ,int c){
        return (a+b+c);
    }


    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(1,2,5));
    }
    
}
