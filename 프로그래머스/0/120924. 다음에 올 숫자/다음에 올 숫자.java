import java.util.*;
class Solution {
    public int solution(int[] common) {
        int[] a = new int[common.length-1]; //공차
        int[] b = new int[common.length-1]; //공비
       
        for(int i=0; i<common.length-1;i++){
            a[i]= common[i+1]-common[i];
        }
        
        for(int i=0; i<common.length-1;i++){
            if(common[i]!=0)
                b[i]= common[i+1]/common[i];
        }
        
        Arrays.sort(a);
        if(a[0]==a[a.length-1])
            return common[common.length-1]+a[0];
        Arrays.sort(b);
        if(b[0]==b[b.length-1])
            return common[common.length-1]*b[0];   
        return 0;
    }
}