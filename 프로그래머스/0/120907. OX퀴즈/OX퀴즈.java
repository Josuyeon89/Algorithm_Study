import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        int x=0;
        int y=0;
        int z=0;
        String[] answer = new String[quiz.length];
        for(int a=0;a<quiz.length;a++){
            String[] s = quiz[a].split(" ");
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[2]);
            z = Integer.parseInt(s[4]);
            
            if(s[1].equals("+")){    //문자열을 비교할때는 == 쓰면x, ==은 참조의 의미. equal을 써야댐
                    if(x+y == z)
                        answer[a]="O";
                    else
                        answer[a]="X";
                }
            else{
                if(x-y == z)
                    answer[a]="O";
                else
                    answer[a]="X";
                }
        }
        
        
        
        
        
        
        return answer;
    }
}