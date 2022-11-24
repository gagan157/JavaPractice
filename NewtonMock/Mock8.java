package NewtonMock;

import java.util.*;;

/*L1 : 1 2 3 4 5

L2 : 9 8 6 3 4 5

Find interaction point of these 2 link list

Output : 3

2nd question:

Input : "hello world"

Output: "h1 e1 l3 o2 w1 r1 d1" */

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Mock8 {
    public static void PrintStr(String str) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // if(!map.containsKey(""+ch)){
            //     map.put(""+ch, 1);
            // }
            // else{
                // int val = map.get(""+ch);
                // val++;
                // }
                
            map.put(""+ch, map.getOrDefault(""+ch, 0) + 1);
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(""+ch) && ch != ' '){
                System.out.print(ch+""+map.get(""+ch));
                map.remove(""+ch);
            }
        }
    }

    
    
    static Node head1 = null;
    static Node tail1 = null;
    public static void bildLikedList(int data) {
        if(head1 == null){
            Node temp = new Node(data);
            head1 = temp;
            tail1 = temp;
        }
        else{
            Node temp = new Node(data);
            tail1.next = temp;
            tail1 = temp;
        }     
    }

    static Node head2 = null;
    static Node tail2 = null;
    public static void bildLikedList2(int data) {
        if(head2 == null){
            Node temp = new Node(data);
            head2 = temp;
            tail2 = temp;
        }
        else{
            Node temp = new Node(data);
            tail2.next = temp;
            tail2 = temp;
        }     
    }

    public static void checkinteraction(){
        Node temp1 = head1;
        HashSet<Integer> set = new HashSet<>();
        while (temp1 != null) {
            set.add(temp1.data);
            temp1 = temp1.next;
        }


        
        Node temp2 = head2;
        while (temp2 != null) {
            if(set.contains(temp2.data)){
                System.out.println("Intersetion = " +temp2.data);
                break;
            }
            temp2 = temp2.next;
        }
       
    }
    public static void printNode(Node root) {
        Node temp = root;

        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        String str = "hello world";
        PrintStr(str);

        // System.out.println();

        
        // bildLikedList(1);    
        // bildLikedList(2);
        // bildLikedList(3);
        // bildLikedList(4);
        // bildLikedList(5);       
        // printNode(head1);
        
        // System.out.println();
        // bildLikedList2(9);
        // bildLikedList2(8);
        // bildLikedList2(6);
        // bildLikedList2(3);
        // bildLikedList2(4);
        // bildLikedList2(5);
        // printNode(head2);
        
        // System.out.println();
        // checkinteraction();
    }
}
