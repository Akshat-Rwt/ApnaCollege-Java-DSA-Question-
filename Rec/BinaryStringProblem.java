package Rec;

public class BinaryStringProblem {

    public static void printBinString(int n , int lastplace , String str){
        if(n == 0 ){
            System.out.println(str);
            return;
        }

        // //Consecutive ones

        // if(lastplace == 0){
        //     printBinString(n-1, 0 ,str+"0");
        //     printBinString(n-1, 1 ,str+"1");
        // }

        // else{
        //     printBinString(n-1, 0 ,str+"0");
        // }

        //Consecutive zeros

        if(lastplace == 0 ){
            
            printBinString(n-1, 1 ,str+"1");
           
            
        }      

        else{
            printBinString(n-1, 0 ,str+"0");           
            printBinString(n-1, 1 ,str+"1");
        }
       
    }
    public static void main(String[] args) {
    printBinString(3, 0,"" );
    }
}
    

