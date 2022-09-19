package Recusrion;

public class calpower {
    public static int calculatepower(int num,int x) {
        if(x == 0){
            return 1;
        }
        if(num == 0){
            return 0;
        }

        int xpower = calculatepower(num, x-1); 
        int xpowen = num * xpower;
        return xpowen;

    }
    public static void main(String[] args) {
        int ans = calculatepower(2, 5);
        System.out.print(ans);
    }
}
