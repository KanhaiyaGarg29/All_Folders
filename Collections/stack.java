package Collections;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<String>animals=new Stack<>();
        animals.push("lion");
        animals.push("dog");
        animals.push("horse");
        animals.push("cat");

        System.out.println("Stack "+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals);
    }
}
