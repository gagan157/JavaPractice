import java.util.Scanner;

public class PrintTableNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tableno = sc.nextInt();

        for (int i = 1; i <=10; i++) {
            int sum = tableno*i;
            System.out.println(tableno + " * " + i +" = "+sum);
        }

        sc.close();
    }
}
