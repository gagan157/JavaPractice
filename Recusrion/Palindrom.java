package Recusrion;

public class Palindrom {
    public static Boolean isPalindrom(String str,int s,int e) {
        if(s >= e){
            return true;
        }

        char fch = str.charAt(s);
        char sch = str.charAt(e);
        if(fch != sch){
            return false;
        }

        return isPalindrom(str, sch+1, e-1);
    }
    public static void main(String[] args) {
        String str = "ABCDCB";
        System.out.println(isPalindrom(str,0,str.length()-1));
        
    }
}
