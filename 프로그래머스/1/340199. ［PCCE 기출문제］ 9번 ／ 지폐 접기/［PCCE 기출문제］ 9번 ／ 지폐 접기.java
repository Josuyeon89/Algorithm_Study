import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wmax = Math.max(wallet[0],wallet[1]); //두 값 비교 함수
        int wmin = Math.min(wallet[0],wallet[1]);
        int bmax = Math.max(bill[0],bill[1]);
        int bmin = Math.min(bill[0],bill[1]);
        /* 
        int wmax=0;
        int wmin=0;
        int bmax=0;
        int bmin=0;
        if(wallet[0]<wallet[1]){
            wmax=wallet[1];
            wmin=wallet[0];                    
        }
        else{
            wmax=wallet[0];
            wmin=wallet[1];                    
        }    
        if(bill[0]<bill[1]) {
            bmax=bill[1];
            bmin=bill[0];
        }                   
        else{
            bmax=bill[0];
            bmin=bill[1];
        }
        */
        
        while(true){    
            if((bmin<=wmax && bmax<=wmin) || (bmin<=wmin && bmax<=wmax))
                break;
            if(bmax>bmin)
                bmax/=2;
            else
                bmin/=2;  
            
            answer++;
        }
        
        return answer;
    }
}