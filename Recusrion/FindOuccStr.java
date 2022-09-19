package Recusrion;

public class FindOuccStr {
    public static int first = -1;
    public static int second = -1;
    public static void findFisrAndLastOucc(String name,int size,char element) {
        if(size == -1){
            return;
        }        
        findFisrAndLastOucc(name, size-1,element);
        if(first == -1){
            if(name.charAt(size) == element)
                first = size;
        }
        else{
            if(name.charAt(size) == element)
                second = size;
        }
    }

    public static void main(String[] args) {
        String name = "abgsdshkkdajas";
        char element = 'a';
        findFisrAndLastOucc(name,name.length()-1,element);
        System.out.println(first);
        System.out.println(second);
    }
}
