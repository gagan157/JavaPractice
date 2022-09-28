package Recusrion;

public class TowerOfHoniu {
    public static void toh(int disk,String src,String des,String help) {
        if(disk == 0){
            return;
        }

        toh(disk-1, src, help, des);
        System.out.println(disk +" "+src + " "+des);
        toh(disk-1, help, des, src);
    }

    public static void toh2(int disk,String src,String help,String des) {
        if(disk == 0){
            return;
        }

        toh2(disk-1, src, des, help);
        System.out.println(disk+" "+src +" "+des);
        toh2(disk-1, help, src, des);
    }

    public static void main(String[] args) {
        // toh(2, "src", "des", "help");
        toh2(2, "src", "help", "des");
    }
}
