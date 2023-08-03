package st2;
import java.util.*;
public class infix {
    public static void main(String[] args) {
        String exp="-+7*45+20";
        Stack<Integer>s=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch>='0' && ch<='9'){
                s.push(ch-'0');
            }
            else{
                int op1=s.peek();
                s.pop();
                int op2=s.peek();
                s.pop();

                switch(ch){
                    case '+':
                    s.push(op1+op2);
                    break;
                    case '-':
                    s.push(op1-op2);
                    break;
                    case '*':
                    s.push(op1*op2);
                    break;
                    case '/':
                    s.push(op1/op2);
                    break;

                }
            }
        }
        System.out.println(s.peek());
    }
}
