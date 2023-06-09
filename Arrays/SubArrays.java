import javax.annotation.processing.SupportedOptions;

public class SubArrays {
    public static void SubArrays(int number[]){
        int total  = 0;
        for(int i = 0 ; i < number.length ; i ++){
            int start  = i ;
            for(int j = i+1 ; j <number.length ; j++){
                int end  = j ;
                for(int  k = start ; k< end ; k++){
                    System.out.print("(" + start + "," + number[k] + ")" );
                }
                System.out.println();
                total++;
            }
            System.out.println();
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        SubArrays(number);
    }
    
}
