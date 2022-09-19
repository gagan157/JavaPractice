package Recusrion;

public class ReverseString {
    public static void ReverseAllstring(String name,int size) {
       if(size == -1){
            return;
       }
       System.out.print(name.charAt(size));
       ReverseAllstring(name, size-1);
    }
    public static void main(String[] args) {
        String name = "gagan";
        int size = name.length()-1;
        ReverseAllstring(name,size);
    }
}
