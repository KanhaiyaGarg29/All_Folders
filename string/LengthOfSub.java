package string;
import java.util.*;
public class LengthOfSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(checkUnique(s,i,j)==true){
                    maxLength=Math.max(maxLength,j-i+1);
                }
            }
        }
        System.out.println(maxLength);
        }
        static boolean checkUnique(String str,int i,int j){
            boolean[] visited=new boolean[256];
            for(int k=i;k<=j;k++){
                if(visited[str.charAt(k)]){
                    return false;
                }
                visited[str.charAt(k)]=true;
            }
            return true;
        }
    }

