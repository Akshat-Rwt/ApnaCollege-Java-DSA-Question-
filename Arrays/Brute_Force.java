public class Brute_Force {
    public static void MaxSubArrays(int number[]){
        
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < number.length ; i ++){
            int start  = i ;
            for(int j = i+1 ; j <number.length ; j++){
                int end  = j ;
               int  currSum = 0 ;
                for(int  k = start ; k< end ; k++){
                    currSum = currSum + number[k];
                }
                System.out.println(currSum);
                if( maxSum< currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum : " + maxSum);
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        MaxSubArrays(number);
    }
    
}

    

