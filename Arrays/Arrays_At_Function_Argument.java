

public class Arrays_At_Function_Argument {

    public static void update(int marks[] , int nonChangeable){
        nonChangeable = 10 ;
        
        for(int i = 0 ; i < marks.length ; i ++){
            marks[i] = marks[i] + 1 ;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97 ,98 ,99};
        int nonChangeable = 5;

        update( marks, nonChangeable);

        for(int i = 0 ; i < marks.length ; i++){
           System.out.print ( marks[i] + " ");

        }
        System.out.println();


    }
}
