class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0;i<array.length;i++){
            int num=Integer.toString(array[i]).length();
            for(int j=0;j<num;j++){
                if(array[i]%10==7)
                    answer++;     
                array[i]=array[i]/10;
            }
                
                    
        }
        
        return answer;
    }
}