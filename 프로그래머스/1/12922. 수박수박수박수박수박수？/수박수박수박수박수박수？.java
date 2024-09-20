class Solution {
    public String solution(int n) {
        
        String[] fff = {"수", "박"};
        String answer = "";
        for(int i=0;i<n;i++){
            answer += fff[i%2];
        }
        
       
        return answer;
    }
}