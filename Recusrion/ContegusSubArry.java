package Recusrion;

public class ContegusSubArry {
    public static void congSubAttay(String str,String ans) {
        if(str.length() == 0){
            // System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String nstr = str.substring(1);
        String anso = "";
        for (int i = 0; i < nstr.length(); i++) {
            anso += ch+nstr;
            System.out.println(anso);
        }
        congSubAttay(nstr, ans);


    }
    public static void main(String[] args) {
        congSubAttay("abc","");
    }
}
