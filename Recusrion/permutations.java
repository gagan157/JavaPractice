package Recusrion;



public class permutations {
    public static void printPermutation(String name,String per,int i) {
        if(name.length() == 0){
            System.out.println(per);
            return;
        }

        for (int j = 0; j < name.length(); j++) {
            Character onechar = name.charAt(j);
            // System.out.println("onechar "+onechar );
            String newstr = name.substring(0, j) + name.substring(j+1);
            // System.out.println("newstr "+newstr);
            printPermutation(newstr, per+onechar, i+1);
        }

    }
    public static void main(String[] args) {
        String name = "abc";
        printPermutation(name,"",0);
    }
}
