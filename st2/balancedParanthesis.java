package st2;
import java.util.*;
public class balancedParanthesis {
    public static void main(String[] args) {
        String s="{[()]}({})[)]";
       if(balanced(s)){
        System.out.println("balanced");
       }
       else{
        System.out.println("unblanaced");
       }
       
    }
    static boolean balanced(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='{' || c=='[' || c=='('){
               st.push(c);
            }
            else if(c=='}'){
                if(st.size()==0 || st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
            else if(c==']'){
                if(st.size()==0 || st.peek()!='['){
                    return false;
                }
                st.pop();
            }
            else if(c==')'){
                if(st.size()==0 || st.peek()!='('){  //st.empty()
                    return false;
                }
                st.pop();
            }
            }
            return st.empty();
    }
}
