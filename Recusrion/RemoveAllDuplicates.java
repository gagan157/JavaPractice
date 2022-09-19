package Recusrion;



public class RemoveAllDuplicates {
    static StringBuilder sb = new StringBuilder();

    public static boolean count(char element) {
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch == element){
                return true;
            }
        }
        return false;
    }

    public static void solution(String name,int i) {
        if(i == name.length()){
            return;
        }
        char ch = name.charAt(i);
        if(sb.length() == 0){
            sb.insert(0, ch);
        }
        else{
            if(!count(ch)){
                sb.append(ch);
            }
        }
        solution(name,i+1);
    }

    public static void main(String[] args) {
        String name = "aaqbbcddee";
        solution(name,0);
        System.out.println(sb);
    }
}
