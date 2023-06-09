public class Max_Sub_Array_Prefix_Sum {
    public static void MaxSubArrays(int number[]){
        
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0 ;

        int prefix[] = new int [number.length];
        prefix[0] = number[0];

        for(int i =  1 ; i<prefix.length ;i ++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i = 0 ; i < number.length ; i ++){
            int start  = i ;
            for(int j = i+1 ; j <number.length ; j++){
                int end  = j ;
               currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
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

    

