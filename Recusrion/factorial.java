package Recusrion;

public class factorial {
    public static int fact(int num) {
        if(num == 1 || num == 0){           
            return 1;
        }
        int factall = fact(num-1);
        int totalfact = num * factall;
        return totalfact;
    }
    public static void main(String[] args) {
        int ans =fact(5);
        System.out.println(ans);
    }
}
