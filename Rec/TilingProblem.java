package Rec ;
public class TilingProblem {

    public static int tilingproblem(int n ){
        
        //Base Case 
        if(n ==0 || n ==1){
            return 1;
        }

        //vertical Choice 
        int fnm1 = tilingproblem(n-1);
        
        //Horizontal Choice 
        int fnm2 = tilingproblem(n-2);

        int totWays = fnm1+fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(3));
    }

    
}
