package st2;
import java.util.*;
public class longestsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
       
        String ans= getUniqueCharacterSubstringBruteForce(input);
        System.out.println(ans);
        sc.close();
    }
     static String getUniqueCharacterSubstringBruteForce(String input) {
        String output = "";
        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (; end < input.length(); end++) {
                char currChar = input.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
        }
        return output;
    }
}
