import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        Arrays.sort(num);   // 오름차순으로 정렬
        
        // 모든 숫자가 같은 경우
        if (num[0] == num[3]) {
            return 1111 * num[0];
        }

        // 세 숫자가 같은 경우
        if (num[0] == num[1] && num[1] == num[2]) {
            return (10 * num[0] + num[3]) * (10 * num[0] + num[3]);
        }
        if (num[1] == num[2] && num[2] == num[3]) {
            return (10 * num[3] + num[0]) * (10 * num[3] + num[0]);
        }

        // 두 쌍이 같은 경우 (가장 일반적인 경우, 두 쌍이 모두 동일한 값이라고 한정함)
        if (num[0] == num[1] && num[2] == num[3]) {
            return (num[0] + num[2]) * Math.abs(num[0] - num[2]);
        }

        // 한 쌍만 같은 경우
        for(int i=0; i<num.length-1 ; i++){
            if(num[i]==num[i+1])
                if(i==1)
                    return num[0]*num[3];
                else
                    return num[num.length-i-1]*num[num.length-i-2];
        }        

        // 모든 숫자가 다른 경우
        return num[0];  // 가장 작은 숫자 반환
    }
}
