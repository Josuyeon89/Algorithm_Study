class Solution {
    public int solution(String A, String B) {
        String repeat = B.repeat(2);
        return repeat.indexOf(A);   //A 문자가 있는 인덱스 반환 -> 민 횟수 반환
            
    }
}