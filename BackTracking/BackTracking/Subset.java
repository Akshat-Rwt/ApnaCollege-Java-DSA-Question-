package BackTracking;

public class Subset {

    public static void fintSubset(String str , String ans  , int i ){
        if( i == str.length() ){
            System.out.println(ans);
            return ; 
        }

        //Yes Choice 
        fintSubset(str, ans + str.charAt(i), i+1);

        //No choice 
        fintSubset(str , ans , i+1);
    }
    public static void main(String[] args) {
        String str = "abc" ;
        fintSubset(str , "" , 0);
    }
    
}
