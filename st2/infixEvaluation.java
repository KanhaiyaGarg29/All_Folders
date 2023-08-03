package st2;
import java.util.*;
public class infixEvaluation {
    public static void main(String[] args) {
        String exp="-+2+3*7/3";
        Stack<Integer>operands=new Stack<>();
        Stack<Character>operators=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
           operators.push(ch);
            }
            else if(Character.isDigit(ch)){
             operands.push(ch-'0');//char to int
            }
            else if(ch==')'){
       while(operators.peek()!='('){
         char op=operators.pop();
         int v2=operands.pop();
         int v1=operands.pop();
         int opv=operation(v1, v2, op);
         operands.push(opv);
       }
            }
            else if(ch=='+'|| ch=='-'||ch=='*'||ch=='/'){
       while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek())){
        char op=operators.pop();
        int v2=operands.pop();
        int v1=operands.pop();
        int opv=operation(v1, v2, op);
        operands.push(opv);
       }
       operators.push(ch);
            }
        }
    
    while(operators.size()!=0){
        char op=operators.pop();
        int v2=operands.pop();
        int v1=operands.pop();
        int opv=operation(v1, v2, op);
        operands.push(opv);
      }
      System.out.println(operands.peek());
    }
    public static int precedence(char op){
        if(op=='+' || op=='-'){
            return 1;
        }
        else if(op=='*'){
            return 2;
        }
        else{
            return 2;
        }
    }
    public static int operation(int v1,int v2,char op){
        if(op=='+'){
            return v1+v2;
        }
        else if(op=='-'){
            return v1-v2;
        }
        else if(op=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
}
