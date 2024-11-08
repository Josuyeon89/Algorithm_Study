class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()+n-1)/n];
        for(int j=0;j<answer.length;j++){
            if((j*n+n)>my_str.length())
                answer[j] = my_str.substring(j*n, my_str.length());
            else
                answer[j] = my_str.substring(j*n,j*n+n);
        }
                

        return answer;
        
    }
}