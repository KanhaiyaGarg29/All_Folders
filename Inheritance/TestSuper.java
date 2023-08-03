package Inheritance;
class Parent{
    String name;
}
public class TestSuper extends Parent {
    String name;
    public void details(){
        super.name="Parent";
        name="Child";
        System.out.println(super.name+" "+name);
    }
    public static void main(String[] args) {
        TestSuper obj=new TestSuper();
        obj.details();
    }
}
