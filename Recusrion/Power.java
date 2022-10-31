package Recusrion;



public class Power {
    public static int power(int n,int p) {
        if(p == 1){
            return n;
        }
        int rem = power(n, p/2);
        //even
        int fi = rem * rem;

        //odd
        if(p % 2 == 1){
            fi = fi * n;
        }
        return fi;
        
    }

    public static double myPow(int x,int n) {
        if(n == 0){
            return 1;
        }
        double half = myPow(x, n/2);
        
        double re = half * half;

        if(n % 2 == 1){
            if(n<0){
                re = (half * half)/x;
            }
            else{

                re = half * half * x;
            }
        }
        return re;
    }
    public static void main(String[] args) {
        // int ans = power(2,5);
        double ans = myPow(2, 5);
        System.out.println(ans);
    }
}
