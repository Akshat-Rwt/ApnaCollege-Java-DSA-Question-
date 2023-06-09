public class Reverse_Of_Array{

    public static void reverse (int number [] ){

        int first  = 0 ;
        int last  = number.length - 1 ;

        while (first  < last){
            int temp  = number[last];
            number[last] = number[first];
            number[first] = temp ;

            first ++;
            last -- ;
        }
    }

    public static void main(String[] args) {
        
        int number[] = {1 ,2 , 3, 4, 5, 6, 7};
        reverse (number);

        for(int i  = 0 ; i < number.length  ; i ++){
            System.out.print(number[i] + " ");
        }
        System.out.println( );
    }
}