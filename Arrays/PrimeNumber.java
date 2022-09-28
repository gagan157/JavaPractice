package Arrays;
import java.util.*;;

public class PrimeNumber {
    public static boolean prime(int num){
        boolean [] arr = new boolean[1000005];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i < arr.length; i++) {
            for (int j = 2 * i; j < arr.length ; j+=i) {
                if(arr[j] == true)
                    arr[j] = false;
                }
        }
        for (int i = 0; i < 50; i++) {
            if(arr[i] != false){
                System.out.print(i +" ");
            }
        }
        return arr[num];
    }
    public static void isPrime(int  num) {
        
         System.out.println(prime(num)?"true":"fasle");
    }
    public static void main(String[] args) {
        isPrime(4);
    }
}
