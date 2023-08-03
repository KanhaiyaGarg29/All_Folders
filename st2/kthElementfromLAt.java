package st2;
import java.util.*;
public class kthElementfromLAt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>a=new ArrayList<>();
        int input=sc.nextInt();
        a.add(input);
        while(input!=-1){
            input=sc.nextInt();
            a.add(input);
        }
        a.remove(a.size()-1);
        // System.out.println(a);
        int k=sc.nextInt();
        System.out.println(a.get(a.size()-k));
        sc.close();
        
    }
}
