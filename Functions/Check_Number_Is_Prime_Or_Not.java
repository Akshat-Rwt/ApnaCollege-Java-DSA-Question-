public class Check_Number_Is_Prime_Or_Not {

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
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    
}
