package Recusrion;

public class Prac {
    public static void prac(int num) {
        if(num == 0){
            return;
        }
        System.out.println("pre " + num);
        prac(num-1);
        System.out.println("in "+num);
        prac(num-1);
        System.out.println("out "+num);
    }
    public static void main(String[] args) {
        prac(3);
    }
}
