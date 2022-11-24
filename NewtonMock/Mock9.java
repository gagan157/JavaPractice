package NewtonMock;

import java.util.HashMap;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Mock9 {
    static Node head = null;
    static Node tail = null;
    public static void buildLinkedList(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    public static Boolean isCycle() {
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

    public static void printList() {
       Node temp = head;
       while (temp != null) {
        System.out.print(temp.data+" ");
        temp = temp.next;
       }
    }

    public static void deleteNodeAtEnd() {
        if(head == null){
            System.out.println("No LinkedList");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
            tail = temp;
        }
        temp.next = null;        
    }

           
    
    public static void main(String[] args) {
        // Node head = null;
        buildLinkedList(1);
        buildLinkedList(2);
        buildLinkedList(3);
        buildLinkedList(4);

        deleteNodeAtEnd();


        buildLinkedList(7);

        printList();

        System.out.println();
  
        head.next.next = head;
        System.out.println(isCycle());
        
    }
}
