import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        
        String ans = my_string.toLowerCase();
        char[] nn = ans.toCharArray();
        Arrays.sort(nn);
        return new String(nn);
    }
}