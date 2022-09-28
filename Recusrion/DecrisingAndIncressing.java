package Recusrion;

public class DecrisingAndIncressing {
    public static void decANDincNum(int num) {
        if(num == 0){
            return;
        }
        System.out.println(num);
        decANDincNum(num -1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        decANDincNum(5);
    }
}
