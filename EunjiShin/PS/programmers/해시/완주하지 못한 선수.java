import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String str : participant){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        for(String str : completion){
            map.put(str, map.get(str)-1);
        }
        
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                answer = key;
            }
        }
        
        return answer;
    }
}