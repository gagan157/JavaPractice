package Exercise;

public class sumAllOddNum {
    public static int sumOddNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans = sumOddNum(10);
        System.out.println(ans);
    }
}
