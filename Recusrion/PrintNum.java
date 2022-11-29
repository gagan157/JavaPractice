package Recusrion;

public class PrintNum {
    public static void printNumInLetters(int Num,String numLetters[]) {
        if(Num == 0){
            return;
        }
        int rem = Num % 10;
        printNumInLetters(Num/10, numLetters);
        System.out.print(numLetters[rem]+" ");
    }
    public static void main(String[] args) {
        String numLetters[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eigth","Nine"};
        int Num = 6534;
        printNumInLetters(Num,numLetters);
    }
}
