package NewtonMock.DSA2_Easy;



class Node {
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Mock5 {
    
   static Node head = null;
    static Node tail = null;
    public static void createLinkList(int data)
    {
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
    public static void main(String[] args) {
    //    ArrayList<Character> arr = new ArrayList<>() ;
    //    String name = "Prabhjot";

    //    for (int i = 0; i < name.length(); i++) {
    //         char ch = name.charAt(i);
    //         arr.add(ch);
    //    }

    //    System.out.println(arr);

    
        int arr[] = {1,2,3,4,5};
        int i = 0;
        while(i<arr.length){
            createLinkList(arr[i]);
            i++;
        }
        
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

}
