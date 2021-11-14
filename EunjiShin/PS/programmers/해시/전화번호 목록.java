import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, String> map = new HashMap<>();
        
        Arrays.sort(phone_book);
        for(String phone_number : phone_book){
            map.put(phone_number, "1");
        }
        
        for(String phone_number : phone_book){
            for(int i=0; i<phone_number.length(); i++){
                String str = phone_number.substring(0, i);
                if(map.containsKey(str)){
                    return false;
                }
            }
        }

        // Hash없이 푼다면 startsWith
        // Arrays.sort(phone_book);
        // for (int i=0; i<phone_book.length-1; i++) {
        //     if (phone_book[i+1].startsWith(phone_book[i])) {
        //         answer = false;
        //         break;
        //     }
        // }
        
        return answer;
    }
}