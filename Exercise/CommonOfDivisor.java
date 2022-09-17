package Exercise;

public class CommonOfDivisor {
    public static void commonDvisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(b);
        return;
    }
    public static void main(String[] args) {
        commonDvisor(6, 4);
    }
}
