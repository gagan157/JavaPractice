package Recusrion;


public class sumNatural {
    public static void SumNaturalNumber(int num,int sum) {
        if(num == 0){
            System.out.print(sum);
            return;
        }
        sum+=num;
        SumNaturalNumber(num-1,sum);
       
    }
    public static void main(String[] args) {
        int sum = 0;
        SumNaturalNumber(5,sum);
        
    }
}