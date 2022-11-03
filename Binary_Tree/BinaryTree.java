package Binary_Tree;

import java.util.*;


class Node{
    int data;
    Node left;
    Node rigth;

    Node(int data){
        this.data = data;
        this.left = null;
        this.rigth = null;
    }

}

public class BinaryTree {
    // static int arr[] = {1, 3, 7, -1, -1, 11, -1, -1, 5, 17, -1, -1, -1};
    static int arr[] = {1,3,5,7,11,17,-1,-1,-1,-1,-1,20,-1};
    static int countLeafNode = 0;
    static int i = 0;
    public static Node buildTree(Node root){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the data");
        int data = arr[i++];
        root = new Node(data);

        if(data == -1){
            return null;
        }
        // System.out.println("Enter left node of "+ data);
        root.left = buildTree(root.left);
        // System.out.println("Enter rigth node of "+ data);
        root.rigth = buildTree(root.rigth); 
        
        return root;
    }
    public static Node buildTreeUsingLevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        int data = arr[i++];
        root = new Node(data);
        q.offer(root);

        while (!q.isEmpty() && i < arr.length) {
            Node temp = q.peek();
            q.poll();

            int leftdata = arr[i++];
            if(leftdata != -1){
                temp.left = new Node(leftdata);
                q.offer(temp.left);
            }
            int rightdata = arr[i++];
            if(rightdata != -1){
                temp.rigth = new Node(rightdata);
                q.offer(temp.rigth);
            }
            if(leftdata == -1 && rightdata == -1){
                countLeafNode++;
            }
        }

        return root;
    }
    public static void printLevelOredreTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.poll();
            if(temp == null){
                System.out.println();
                if(!q.isEmpty()){
                   q.offer(null);
                }
            }
            else{

                System.out.print(temp.data+" ");               
                
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.rigth != null){
                    q.offer(temp.rigth);
                }
                
            }
        }
    }
    public static void printReverseOrderTravel(Node root) {
        Queue<Node> q = new LinkedList<>();
        Stack<Node> st = new Stack<>(); 
        st.push(root);
        st.push(null);
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.poll();
            if(temp == null){
                // System.out.println();
                if(!q.isEmpty()){
                    q.offer(null);
                    st.push(null);
                }
            }
            else{
                // System.out.print(temp.data+" ");
                if(temp.rigth != null){
                    q.offer(temp.rigth);
                    st.push(temp.rigth);
                }
                if(temp.left != null){
                    q.offer(temp.left);
                    st.push(temp.left);
                }
            }
        }  
        
        //print reverse 
        while (!st.isEmpty()) {
            Node temp = st.peek();
            st.pop();
            if(temp != null){
                System.out.print(temp.data+" ");
            }
            else{
                System.out.println();
            }
        }     
    }
    public static void printPreOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.rigth);
    }
    public static void printInOrder(Node root) {
        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.rigth);
    }
    public static void printPostOrder(Node root) {
        if(root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.rigth);
        System.out.print(root.data+" ");
    }
    // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1 
    public static void main(String[] args) {
       Node root = null;
    //    root = buildTree(root);
        root = buildTreeUsingLevelOrder(root);
       System.out.println("<----Print---->");
       printLevelOredreTraversal(root);

    //    System.out.println("<------reverse print------>");
    //    printReverseOrderTravel(root);
    //    System.out.println();
    //    System.out.println("\nPreOrder");
    //    printPreOrder(root);
    //    System.out.println("\nInOrder");
    //    printInOrder(root);
    //    System.out.println("\nPostOrder");
    //    printPostOrder(root);

    System.out.println("leafnode "+countLeafNode);

    }
}
