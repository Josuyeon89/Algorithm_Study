import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[array.length];
        for(int i =0; i<count.length;i++)   //count 배열 0으로 초기화
            count[i]=0; 
        
        Arrays.sort(array); //값 정렬
        
        if(array.length==1)     // array에 값이 1개인 경우
            return array[0];
        if(array.length==2 && array[0]==array[1])       //array 값 2개인 경우
            return array[0];
        else if(array.length==2 && array[0] != array[1])
            return -1;
        for(int i=0;i<array.length-1;i++){      //중복값이 나오는 인덱스에 중복값이 나오는 횟수 저장
            for(int j=i; j<array.length-1; j++) {   
                if(array[j] == array[j+1]){
                        count[i]+=1;                        
                }
                else
                    break;
            }
            i+=count[i];    // 중복값이 끝난 이후 인덱스부터 체크
        }
        int top=count[0];
        int index=0;
        for(int i=1 ; i < count.length-1 ; i++){     //나온횟수(count)의 최댓값 구하기     
            if(top<count[i]){
                top = count[i];
                index=i;
            }                
        }
        
        for(int j=0;j<count.length;j++)     //최빈값이 2개이상이면 -1 리턴
            if(j!=index)
                if(top==count[j])
                    return -1;
        answer = array[index];
        return answer;
    }
}