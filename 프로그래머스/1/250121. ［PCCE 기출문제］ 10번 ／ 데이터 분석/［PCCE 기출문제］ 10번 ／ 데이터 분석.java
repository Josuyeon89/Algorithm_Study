import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<int[]> result = new ArrayList<>();
        
        for(int i=0; i<data.length;i++){
            boolean compare = false;    //list에 결과 저장하기 위해 val_ext보다 작으면 true
            switch(ext){
                case "code":
                    if(data[i][0]<val_ext) compare = true;
                    break;
                case "date":
                    if(data[i][1]<val_ext) compare = true;
                    break;
                case "maximum":
                    if(data[i][2]<val_ext) compare = true;
                    break;
                case "remain":
                    if(data[i][3]<val_ext) compare = true;
                    break;
            }
            if(compare ==true)  //val_ext보다 작은 경우에만 해당 행 result에 삽입
                result.add(data[i]);
        }
        
        switch(sort_by){
            case "code":
                result.sort(Comparator.comparingInt(a ->a[0]));
                //comparingInt - 비교,정렬 method, 여기선 result의 첫번째 자리로 비교
                //a -> a[0]은 람다식 result 리스트의 배열 a에서 a[0]을 기준으로.
                break;
            case "date":
                result.sort(Comparator.comparingInt(a ->a[1]));
                break;
            case "maximum":
                result.sort(Comparator.comparingInt(a ->a[2]));
                break;
            case "remain":
                result.sort(Comparator.comparingInt(a ->a[3]));
                break;
        }
        
        
        int[][] answer = result.toArray(new int[result.size()][data[0].length]);
        return answer;
    }
}