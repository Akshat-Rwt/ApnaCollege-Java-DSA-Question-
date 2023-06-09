package Rec;

public class FriendsPairing {

    public static int friendPairing(int n ){
        
        //Base Case 
        if(n==1 || n==2){
            return 2 ;
        }

        // single
        int fnm1 = friendPairing(n-1);

        //pair
        int fnm2 = friendPairing(n-2);
        int pair = (n-1) * friendPairing(n-2);
         
        int totWays = fnm1 + fnm2 ;
        return totWays ;

        }
    public static void main(String[] args) {
       System.out.println(friendPairing(3)); 
    }
    
}
