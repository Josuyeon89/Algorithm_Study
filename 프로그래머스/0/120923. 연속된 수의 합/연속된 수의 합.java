class Solution {
    public int[] solution(int num, int total) {
        int sum =0;
        int[] answer = new int[num]; 
        //배열 선언: 자료형[] 변수 = new 자료형[size];
        int first=0;
        for(int i=0;i<num;i++){
            sum+=i;
        }
        first=(total-sum)/num;
        for(int i=0;i<num;i++){
            answer[i]=first+i;
        }    
        return answer;
    }
}