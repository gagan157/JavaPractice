package StarPattern;

/*
 output

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */


public class StarPattern8 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                int addboth = i+j;
                if(addboth % 2 == 0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
