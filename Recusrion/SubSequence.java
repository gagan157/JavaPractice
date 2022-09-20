package Recusrion;

public class SubSequence {
    public static void solution(String name,int i,String newname) {
        if(i==name.length()){
            System.out.println(newname);
            return;
        }
        char currname = name.charAt(i);
        solution(name, i+1,newname+currname);

        solution(name, i+1,newname);
    }
    public static void main(String[] args) {
        String name = "abc";
        // String newarr ="";
        solution(name,0,"");
    }
}
