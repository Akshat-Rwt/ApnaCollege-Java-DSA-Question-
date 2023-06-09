

public class Binary_Search {
    public static int Binary_Search(int number[]  , int key){
        int start  = 0 ; int end  = number.length - 1 ;

        while (start <= end ){
            int mid = (start + end) / 2 ;

            if(number[mid] == key) { // found
                return mid;
            }

            if(number[mid] < key ){
                start = mid +1 ;
            }
            else {
                end  = mid -1;
            }
        }
        return  -1 ;
    }
    public static void main(String[] args) {
        int number[] = { 1, 2, 3 ,4, 5, 6, 7, 8 ,9};
        int key = 8 ;

        int result  = Binary_Search(number, key);
        System.out.println("Index is : " + result);
    }
}
