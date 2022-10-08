package LearnInheritance;


class Department {
    String Name;
    static String CompanyName;

    Department(){
        System.out.println("Constructor");
    }
    Department(String name){
        this.Name = name;
        System.out.println("parametrise Contructor");
    }

    public void manage() {
        System.out.println("maage department");
    }
}

class It extends Department{
    It(String name){
        super(name);
    }
    @Override
    public void manage() {
        System.out.println("Child method manage department");
    }
}



public class learnInheritance {
    public static void main(String[] args) {
        Department.CompanyName = "TechnoPark";
        Department dp = new It("gagan");
        dp.manage();
    }
}
