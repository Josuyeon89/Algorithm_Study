class Solution {
    public int solution(String[] babbling) {
        int count=0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        for(int i=0 ; i<babbling.length ; i++){            
            for(int j=0; j<speak.length;j++){
                if(babbling[i].contains(speak[j]))
                    babbling[i]=babbling[i].replace(speak[j], " "); // babbling이 나온 부분 공백으로 대체
            }
            if(babbling[i].isBlank()) //isBlank는 널값+공백, isEmpty는 널값만
                count++;       
        }
              
        return count;
    }
}