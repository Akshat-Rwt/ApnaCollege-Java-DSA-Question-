package LinkedListPart2;

public class RemoveCycle {

    public static class Node {

        int data ;
        Node next ;
        

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head ;
    public static Node tail ;
    public static int  size;

    public void addFirst(int data){

        //Step1 - Create new node 
        Node newNode = new Node(data);
        size ++;

        if(head == null){
            head = tail = newNode ;
            return ;
        }

        //Step 2 - newNode  next = head
        newNode.next = head ; //Link


        //Step 3 - head = newNode 
        head = newNode ;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size ++;

        if(head == null){
            head = tail = newNode ;
            return ;

        }

        tail.next = newNode ;
        tail = newNode ;
    }

    public void print(){
        Node  temp = head ; 

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }

        System.out.println("null");
    }

    public void add(int idx , int data){

        if(idx == 0){
            addFirst(data);
            return ; 
        }

        Node newNode = new Node(data);
        size ++;

        Node temp = head ;
        int i = 0 ;
        while(i < idx -1){
            temp = temp.next ;
            i++;
        }

        //i = idx ; temp -> previous node

        newNode.next = temp.next ;
        temp.next = newNode ;
    }

    public int removeFirst(){

        if(size == 0 ){
            System.out.print("Linked lISt is Invalid");
            return Integer.MIN_VALUE ;
        }

        else if(size == 1){
            int val = head.data ;
            head = tail = null ;
            return val ;

        }
        int val = head.data ;
        head = head.next;

        size-- ;

        return val ;
    }

    public int removeLast(){

        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE ;

        }

        else if (size ==  1){
            int val  = head.data ;
            head  = tail = null ;
            size  = 0 ;
            return val  ;

        }

        //prev i = size -2 

        Node prev = head ;
        for(int i =0 ; i < size-2 ;  i ++){
            prev = prev.next ;
        }


        int val  = prev.next.data ; //Tail data 
        prev.next = null ;
        tail = prev ;
        size -- ;
        return val ;

    }

    public static boolean isCycle(){
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;

            if(slow == fast){
                return true ;
            }
        }

        return false ;

    }

     public static void removeCycle(){
            
            //Detect cycle

            Node slow = head ;
            Node fast = head ;

            boolean cycle = false;

            while(fast != null && fast.next != null){
                slow = slow.next ;
                fast = fast.next.next ;

                if(slow == fast ){
                   cycle = true ;
                   break;

                }
            }

            if(cycle == false ){
                return;

            }

            //Find meeting points 

            slow = head ;
            Node prev = null ; // Last one 
            while(slow != fast ){
                prev = fast ;

                slow= slow.next ;
                fast = fast.next;


            }

            //Remove Cycle 

            prev.next = null ;

        }
    

   public static void main(String[] args) {
        
        head = new Node(1);
        Node temp = new Node (2);
        head.next =temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());

        removeCycle();
        System.out.println(isCycle());

    }
    
}

    
       
    
