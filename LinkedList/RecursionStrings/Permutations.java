package RecursionStrings;

public class Permutations {
    public static void main(String[] args) {
        permut("", "abc");
         System.out.println(permutCount("", "abc"));
    }
    static void permut(String p,String up){
      if(up.isEmpty()){
        System.out.println(p);
        return;
      }
      
      char ch=up.charAt(0);
      for(int i=0;i<=p.length();i++){
        String f=p.substring(0, i);
        String s=p.substring(i,p.length());
        permut(f+ch+s, up.substring(1));
       
      }
    }

     static int permutCount(String p,String up){
      if(up.isEmpty()){
       return 1;
      }
      int count=0;
      char ch=up.charAt(0);
      for(int i=0;i<=p.length();i++){
        String f=p.substring(0, i);
        String s=p.substring(i,p.length());
        count=count+permutCount(f+ch+s, up.substring(1));
      }
      return count;
    }
}
