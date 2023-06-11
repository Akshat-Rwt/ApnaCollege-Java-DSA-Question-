package Recursion;

public class ReverseString {

    static String reverse(String s ){
        //Terminating case 
        if(s.length() == 1){
            return String.valueOf(s.charAt(0));
        }
        return (s.substring(1) + s.charAt(0));
    }
    public static void main(String[] args) {
        String str = "Skillrises";
        System.out.println(reverse(str));
    }
    
}
