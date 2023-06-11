package Recursion;

public class Palindrome {

    static boolean ispalindrome(String str){
        String rev = "";

        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    static boolean isPalRec(String str, int s, int e)
{

        if (s == e){
            return true;}

          if ((str.charAt(s)) != (str.charAt(e))){
           return false;}


         if (s < e + 1){
         return isPalRec(str, s + 1, e - 1);}

    return true;
}

    public static void main(String[] args) {
        System.out.println(ispalindrome("NAMAN"));  
        System.out.println(isPalRec("NAMAN" , 0 , 0));       
        
    } 
}
