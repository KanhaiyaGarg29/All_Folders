package string;
import java.util.Arrays;
import java.util.Scanner;
public class Exception1
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println(arr[0]);
System.out.println(arr[4]);
try
{
 subfn(arr);
 }
catch (Exception e)
 {
 System.out.println(e);
 }
}
static void subfn(int[] arr) throws Exception{
    int sub=arr[0];
    for(int i=1;i<5;i++){
        sub=sub-arr[i];
    }
    System.out.println(sub);
    if(sub<0){
        throw new  Exception("Subtract is less than zero");
    }
    else{
        throw new Exception("Subtract is greater than zero");
    }
}
}