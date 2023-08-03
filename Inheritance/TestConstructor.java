package Inheritance;

public class TestConstructor extends Parent1 {
    String name;
    TestConstructor(String n1,String n2){
        super(n1);
        this.name=n2;
    }
    public void details(){
        System.out.println(super.name+" and "+name);
    }
    public static void main(String[] args){
        TestConstructor obj=new TestConstructor("Kanhaiya", "Rahul");
        // System.out.println(obj);
        obj.details();
    }
}
