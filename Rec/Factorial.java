package Rec;

public class Factorial {

    public static int Fact(int num){
        //Base Case 
        if(num == 0){
            return 1 ;
        }
        return Fact(num-1) * num;
    }

    static int  Factloop(int num){
        int m =1 ;
        for(int i = 1 ; i <= num ; i++){
            m  = m * i ;
        }
        return m ;
    }
    public static void main(String[] args) {
        int num = 5 ;
        //System.out.println(Fact(num));
        System.out.println(Factloop(num));

    }
    
}
