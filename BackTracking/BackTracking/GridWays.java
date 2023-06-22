package BackTracking;
public class GridWays {


    public static int GridWays(int i , int j , int n, int m){

        //BASE CASE 
        if(i == n -1 && j == m-1){ //Condition for Last Cell
            return 1 ;
        }

        else if(i == n || j == m){ //Condition for boundary Cross
            return  0 ;
        }

        int w1 = GridWays(i+1, j, n, m); // For Row Cond
        int w2 = GridWays(i, j+1, n, m); // For Col Cond
        
//        int w3 = GridWays(i+1, j+1, n, m);  // for Daigonal cond

//      return w1 + w2 + w3; 
        return w1 + w2 ; 
    }
    public static void main(String[] args) {
        int n = 3 , m = 3 ;
        System.out.println(GridWays(0 ,0 ,n , m));
    }
    
}
