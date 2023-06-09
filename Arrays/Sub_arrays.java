public class Sub_arrays {
    public static void Sub_Arrays(int numbers[]){
        int total = 0;
        for(int i  = 0 ;i <numbers.length;  i++){
            int start = i ;
            for(int j = i  ; j < numbers.length ; j ++ ){
                int end  = j;
                for(int k = start ; k <= end ; k++) {
                    System.out.print(numbers[k] + " ");
                }
                total++ ;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays  = " + total);

    }
    public static void main(String[] args) {
        int numbers[] = {2 ,4, 6 ,8 ,10};
        Sub_Arrays(numbers);
    }

}
