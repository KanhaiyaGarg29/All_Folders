package RecursionStrings;

public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicates("GeeksForGeeks"));
    }
    static String duplicates(String up){
        if(up.length()<=1){
            return up;
        }
        char ch=up.charAt(0);
        if(up.charAt(0)==up.charAt(1)){
           return duplicates(up.substring(1));
        }
        return ch+duplicates(up.substring(1));
    }
}
