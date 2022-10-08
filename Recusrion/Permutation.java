package Recusrion;

public class Permutation {
    public static void permutation(String str,String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String lefprt = str.substring(0, i);
            String rigprt = str.substring(i+1);
            String rog = lefprt+rigprt;
            permutation(rog, ans+ch);
        }
    }
    public static void main(String[] args) {
        permutation("abc", "");
    }
}
