import java.util.Scanner;

public class PrintTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Table Number is "+ i);
            for (int j = 1; j <= 10; j++) {
                int sum = i * j;
                System.out.println(i +" * "+ j + " = "+sum);
            }
            System.out.println();
        }

        sc.close();
    }
}
