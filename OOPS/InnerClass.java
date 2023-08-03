package OOPS;
//outside cannot be static inner class can be static

public class InnerClass {
    static class Test{//static means it does not depend on the object of outer class
        String name;
     
     public Test(String name){
     this.name=name;
     }
    }
    public static void main(String[] args) {
        Test test=new Test("Kanhaiya");
        Test a=new Test("Rahul");
        System.out.println(test.name);
        System.out.println(a.name);

        // System is a class out is variable and println is a method
        //. binds instatnce variables and instatnce methods with reference variables
    }
}
