import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        //(dh,dw) -> (0,1),(1,0) 이런식으로 위,아래,왼,오
        
        for(int i=0;i<4;i++){
            int h_check = h+dh[i];  //선택한 위치의 위, 아래 체크
            int w_check = w+dw[i];  //선택한 위치의 오, 왼 체크
            if(h_check<n&& h_check>=0 && w_check<n && w_check>=0){
                if(board[h][w].equals(board[h_check][w_check])) //선택한 위치와 4방향 중 한 방향의 색이 같다면
                    count+=1;   
            }                
        }        
        return count;
    }
}