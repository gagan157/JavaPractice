package NewtonMock;

import java.util.HashMap;

/*
 llist.push(20);

llist.push(4);

llist.push(15);

llist.push(10);

/*Create loop for testing 

 */

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Mock7 {
    
    static Node head = null;
    static Node tail = null;
    public static void createLinkList(int data) {
        if(head == null){
            Node temp = new Node(data);
            head = temp;
            tail = temp;
        }
        else{
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;
        }
    }

    public static Boolean Checkloop() {
        HashMap<Node,Boolean> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if(!map.containsKey(temp)){
                map.put(temp, true);
            }
            else{
                return true;
            }
            temp = temp.next;
        }
        return false;      
    }

    public static void printLinked() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
      
    }
    public static void main(String[] args) {
        createLinkList(1);
        createLinkList(2);
        createLinkList(3);
        createLinkList(4);
        printLinked();
        System.out.println();
        // llist.head.next.next.next.next = llist.head;

        // head.next.next.next = head;

        System.out.println("loop in LinkedList = "+Checkloop());
        
    }
}
