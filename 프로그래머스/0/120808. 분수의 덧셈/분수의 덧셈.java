class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int d = denom1*denom2;
        int n = (numer1*denom2) + (numer2*denom1);
        
            if(d>=n)
                for(int i=n ; i>1;i--){ 
                   if(d%i==0 && n%i==0){
                       d=d/i;
                       n=n/i;
                   }
                }
            if(d<n)
                for(int i=d ; i>1;i--){
                   if(d%i==0 && n%i==0){
                       d=d/i;
                       n=n/i;
                   }
                }                          
        int[] answer = {n, d};
        return answer;
    }
}