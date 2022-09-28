package Recusrion;

public class factorial {
    public static int fact(int num) {
        if(num == 1){
            return 1;
        }
       int fn = fact(num-1); 
       int fnifn = num * fn;
       return fnifn;
    }
    public static void main(String[] args) {
      int ans = fact(5);
      System.out.print(ans);
    }
}
