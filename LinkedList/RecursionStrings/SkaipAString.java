package RecursionStrings;

public class SkaipAString {
    public static void main(String[] args) {
        System.out.println(skipString("baccappledaht"));
        System.out.println(skipAppNotApple("bacdappht"));
    }
     static String skipString(String up){
        if(up.isEmpty()){
           
            return "";
        }
        
        if(up.startsWith("apple")){
             return skipString(up.substring(5));
        }
        else{
            return up.charAt(0)+skipString(up.substring(1));
        }
    }

     static String skipAppNotApple(String up){
        if(up.isEmpty()){
           
            return "";
        }
        
        if(up.startsWith("app") && !up.startsWith("apple")){
             return skipAppNotApple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
}
}
