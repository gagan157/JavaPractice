package Recusrion;

public class ReveseString {
    public static void printReverseString(String str) {
        if(str.length() == 0){
            return;
        }

        char ch = str.charAt(0);
        String newstr = str.substring(1);
        printReverseString(newstr);
        System.out.print(ch);
    }
    public static void main(String[] args) {
        String str = "gagan";
        printReverseString(str);
    }
}
