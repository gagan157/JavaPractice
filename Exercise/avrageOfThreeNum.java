package Exercise;

public class avrageOfThreeNum {
    public static void avreage(int a,int b,int c) {
        int sum = a+b+c;
        sum /= 3;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        avreage(2, 3, 4);
    }
}
