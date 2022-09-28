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
    public static void main(String[] args) {
        int ans = power(2,3);
        System.out.println(ans);
    }
}
