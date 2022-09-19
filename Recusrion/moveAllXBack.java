package Recusrion;

public class moveAllXBack {
    public static String newname = "";
    public static void Solution(String name,int i,int count,char element) {
        if(i == name.length()){
            for (int j = 0; j < count; j++) {
                newname+=element;
            }
            return;
        }
        char n = name.charAt(i);
        if(n != element){
            newname += n;
        }
        else{
            count++;
            
        }
        Solution(name, i+1,count,element);
    }
    public static void main(String[] args) {
        String name = "axtewxdxfwx";
        Solution(name, 0,0,'x');
        System.out.println(newname);
    }
}
