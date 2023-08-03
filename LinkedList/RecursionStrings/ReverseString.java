package RecursionStrings;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello World",0));
    }
    static String reverse(String s,int index){
        if(index==s.length()){
            return "";
        }
        String smallAns=reverse(s, index+1);
        return smallAns+s.charAt(index);
    }
    static String reverse2(String s){
        if(s.length()==0){
            return "";
        }
        String smallAns=reverse2(s.substring(1));
        return smallAns+s.charAt(0);
    }
}
