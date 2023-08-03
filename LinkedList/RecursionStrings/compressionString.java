package RecursionStrings;

public class compressionString {
    public static void main(String[] args) {
        String s="aaabbccds";
        String s1=compression1(s);
        System.out.println(s1);
       String s2=compression2(s);
       System.out.println(s2);
   }
   public static String compression1(String s){
   
    StringBuilder sb=new StringBuilder();
    sb.append(s.charAt(0));
   for(int i=1;i<s.length();i++){
      char curr=s.charAt(i);
      char prev=s.charAt(i-1);
      if(curr!=prev){
        sb.append(curr);
      }
}
return sb.toString();
   }
   public static String compression2(String s){
    StringBuilder sb=new StringBuilder();
    int count=1;
    sb.append(s.charAt(0));
   for(int i=1;i<s.length();i++){
      char curr=s.charAt(i);
      char prev=s.charAt(i-1);
      if(curr==prev){
       count++;
      }
      else{
       // if(count>1){
            sb.append(count);
            count=1;
     //  }
        sb.append(curr);
      }
}
//if(count>1){
    sb.append(count);
    count=1;
//}
return sb.toString();
   }
}
