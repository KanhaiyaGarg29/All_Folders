package OOPS;

public class Main {
    public static void main(String[] args) {
        SingletonExample obj=SingletonExample.getInstance();
        SingletonExample obj2=SingletonExample.getInstance();//returning the same instance as that of obj1
        SingletonExample obj3=SingletonExample.getInstance();//returning the same instance as of obj1

        //all 3 ref variables are just pointing to one object
    }
}
