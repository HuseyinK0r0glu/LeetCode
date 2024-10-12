class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        int event1S = Integer.parseInt(event1[0].split(":")[0]) * 60 + Integer.parseInt(event1[0].split(":")[1]);
        int event1E = Integer.parseInt(event1[1].split(":")[0]) * 60 + Integer.parseInt(event1[1].split(":")[1]);
        
        int event2S = Integer.parseInt(event2[0].split(":")[0]) * 60 + Integer.parseInt(event2[0].split(":")[1]);
        int event2E = Integer.parseInt(event2[1].split(":")[0]) * 60 + Integer.parseInt(event2[1].split(":")[1]);
        
        return !(event1E < event2S || event2E < event1S);
        
    }
}