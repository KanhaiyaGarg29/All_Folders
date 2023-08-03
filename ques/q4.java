package ques;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        for(int i=n1;i<=n2;i++){
             if(!RepeatedDigits(i)){
                count++;
             }
          }
          System.out.println(count);
          sc.close();
        }
      static boolean RepeatedDigits(int num){
        int[] temp=new int[10];//boolean array
        while(num>0){
            int digit=num%10;
            if(temp[digit]==1){//temp[digit]
                return true;
            }
            temp[digit]=1;//true
            num=num/10;
        }
        return false;
      }
    }

