

public class Largest_Smallest_Number_In_Array {

    public static void getLNS(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(largest < number[i])
            {
                largest = number[i];
            }
            
            if(smallest > number[i]){
                smallest = number[i];   
            }
        }
       System.out.println("Largest number is : " + largest);
       System.out.println("Smallest number is : " + smallest);
    }
    public static void main(String[] args) {
        int number [] = {2,3,45,6};
        getLNS(number);
    }
    
}
