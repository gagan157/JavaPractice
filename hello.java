import java.util.*;

class Main{
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        //nextInt()
        //nextFloat()


        // String name = sc.nextLine();
        // //print
        // System.out.println("My name is "+name);

        // string to integer
        String wor = "12345";
        char ch = wor.charAt(1);
        System.out.println((ch-'0')+2);
        
        //capital to lower
        String alpha = "ABCD";
        char alpa = alpha.charAt(0);
        int convLower = alpa - 'A' + 'a';
        System.out.println((char)convLower);
        sc.close();
    }
};

