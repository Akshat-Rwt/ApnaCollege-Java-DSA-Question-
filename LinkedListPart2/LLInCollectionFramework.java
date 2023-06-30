package LinkedListPart2;

import java.util.LinkedList;
public class LLInCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // ADD

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll); //0 -> 1 -> 2


        //Remove 

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
