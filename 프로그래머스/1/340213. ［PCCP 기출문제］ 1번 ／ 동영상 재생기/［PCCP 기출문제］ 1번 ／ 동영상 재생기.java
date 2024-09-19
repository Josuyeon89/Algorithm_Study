class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {    
        String videos[] = video_len.split(":");
        String poss[] = pos.split(":");
        String starts[] =op_start.split(":");
        String ends[] = op_end.split(":");
        
        int video = Integer.parseInt(videos[0])*60+Integer.parseInt(videos[1]);
        int po = Integer.parseInt(poss[0])*60+Integer.parseInt(poss[1]);
        int start = Integer.parseInt(starts[0])*60+Integer.parseInt(starts[1]);
        int end = Integer.parseInt(ends[0])*60+Integer.parseInt(ends[1]);
                
        
        for(int i=0; i<commands.length ; i++){
            if(po>=start && po<=end)
                po=end;
            if(commands[i].equals("next")){                       
                if(video-po>=10)    //동영상의 남은시간이 10초 이상인 경우만
                    po += 10;
                else
                    po=video;
            }
            else if(commands[i].equals("prev")){
                if(po>10)  //pos가 10보다 작으면 0으로
                    po -= 10;
                else
                    po=0;
            }    
        }
        if(po>=start && po<=end)
            po = end;
        if(video-po<10)    //동영상의 남은시간이 10초 이상인 경우만
                    po=video;
        
        int min = po/60;    //초->분
        int sec = po%60;
        
        String mins = ""+min;
        String secs = ""+sec;
        
        if(min<10)    //분, 초가 한 자리일 경우 0을 붙여 2자리로
            mins = "0"+mins;
        if(sec<10)
            secs = "0"+secs;
        
        String result = ""+mins+":"+""+secs;
        return result;
    }
}