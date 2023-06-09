public class Pairs_In_Arrays {
    public static void printParis(int number[]){
        for(int i = 0 ; i < number.length ; i++){
            int curr = i;
            for(int j = 0 ; j < number.length ; j ++){
                System.out.print("(" + curr + "," + number[j] +")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6};
        printParis(number);
    }
    
}
