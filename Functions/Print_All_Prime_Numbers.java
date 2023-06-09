public class Print_All_Prime_Numbers {
    //only for n >=2 
    public static boolean isPrime(int n ){
        //corner cases 
        //1 
        if(n == 2){
            return true;
        }

        
        for(int i = 2 ; i <n ; i ++){ // also use condition  {i <=math.sqrt(n)}
            if(n % i == 0 ){ //complete dividing 
                return false;
            }
        }
        return true ; 
    }

    public static void PrimeRange(int n ){
        for(int i  = 2 ; i <= n ; i ++ ){
            if(isPrime (i)) { //true
            System.out.print(i + " ");
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        PrimeRange(100);
    }
    
}
