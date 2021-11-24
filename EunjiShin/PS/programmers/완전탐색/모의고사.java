import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int max = 0;
        int count = 0;
        
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5]) score[0]++;
            if(answers[i] == b[i%8]) score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }
        
        max = Math.max(Math.max(score[0], score[1]), score[2]);
        
        for(int i=0; i<3; i++){
            if(max == score[i]) count++;
        }
        answer = new int[count];
        
        int j = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) answer[j++] = i+1;
        }
        
        
        return answer;
    }
}

// HashMap쓰면 더 빨라지지 않을까 싶었는데 절대 착각이었음..^^ 

// import java.util.*;

// class Solution {
//     public int[] solution(int[] answers) {
//         int[] answer = {};
//         int max = 0;
//         int count = 0;
        
//         int[] a = new int[]{1,2,3,4,5};
//         int[] b = new int[]{2,1,2,3,2,4,2,5};
//         int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};
        
//         int[] score = new int[3];
//         Map<Integer, Integer> score2 = new HashMap<>(){{
//             put(0,0);
//             put(1,0);
//             put(2,0);
//         }};
        
//         for(int i=0; i<answers.length; i++){
//             if(answers[i] == a[i%5]) score2.put(0, score2.get(0)+1);
//             if(answers[i] == b[i%8]) score2.put(1, score2.get(1)+1);
//             if(answers[i] == c[i%10]) score2.put(2, score2.get(2)+1);
//         }
        
//         max = Collections.max(score2.values());
    
//         for(int i=0; i<3; i++){
//             if(max == score2.get(i)) count++;
//         }
//         answer = new int[count];
        
//         int j = 0;
//         for(int i=0; i<3; i++){
//             if(score2.get(i) == max) answer[j++] = i+1;
//         }
        
        
//         return answer;
//     }
// }