import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> str = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            str.add(Integer.toString(numbers[i]));
        }
        
        Collections.sort(str, (a,b) -> (b+a).compareTo(a+b));
        
        if(str.get(0).equals("0")){
            return "0";
        }
        
        for(String s : str){
            answer += s;
        }
        
        return answer;
    }
}