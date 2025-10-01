import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class AuthenticationManager {

    int time = 0;
    Map<String, Integer> map = new HashMap<>();

    public AuthenticationManager(int timeToLive) {
        this.time = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime + time);
    }

    public void renew(String tokenId, int currentTime) {
        if(map.containsKey(tokenId)) {
            if(map.get(tokenId) > currentTime) {
                map.put(tokenId, currentTime + time);
            }else {
                map.remove(tokenId);
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        if(map.isEmpty()) return count;
        for(String key : map.keySet()) {
            if(map.get(key) > currentTime) {
                count++;
            }
        }
        return count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */