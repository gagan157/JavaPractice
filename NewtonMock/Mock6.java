package NewtonMock;
/*
 String S = "i.like.this.program.very.much"

Reverse the words of this string

Output: much.very.program.this.like.i
 */

public class Mock6 {    
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }  
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;       
        
    //addNode() will add a new node to the list    
    public void push(int data) {    
        Node temp = new Node(data);
        if(head == null){
            head = temp;
        }           
        else{
            temp.next = head;
            head = temp;
        }                       
    } 

    public int peek() {
        if(head != null){
            return head.data;
        }
        return -1;
    }  
    
    public void pop(){
        if(head != null){
            Node lstnode = head;
            head = head.next;
            System.out.println(lstnode.data);
            return;
        }
        System.out.print("No stack");
    }
    
        
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        Mock6 sList = new Mock6();    
            
        //Add nodes to the list    
        sList.push(1);    
        sList.push(2);    
        sList.push(3);    
        sList.push(4);    

        sList.pop();
        System.out.println(sList.peek());
        // System.out.println();
        //Displays the nodes present in the list    
        sList.display();    
    }    
}