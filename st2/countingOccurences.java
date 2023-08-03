package st2;
import java.util.*;
public class countingOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub=sc.nextLine();
        s=s.toLowerCase();
        int index=0;
        int count=0;
        while((index=s.indexOf(sub, index))!=-1){
            count++;
            // index++;
        index=index+sub.length();
    }
    System.out.println(count);
    sc.close();
        // while(index!=-1){
        //     index=s.indexOf(sub, index);
        //     if(index!=-1){
        //         count++;
        //         index=index+sub.length();
        //     }
        // }
    }
}