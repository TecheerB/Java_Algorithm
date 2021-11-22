import java.util.*;


public class mathTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] answer = new int[testCase];
        for(int i = 0; i<testCase; i++){
            answer[i] = sc.nextInt();
        }
        sc.close();
        int[] ret = solution(answer);
        System.out.print("[");
        for(int i = 0; i<ret.length; i++){
            System.out.print(ret[i]);
        } 
        System.out.println("]");
        
    }

    public static int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int[] ansCount  = {0,0,0};
        
        for (int i = 0; i< answers.length; i++){
            if (student1[(i % student1.length)] == answers[i]){
                ansCount[0] ++;
            }
            if (student2[i%student2.length] == answers[i]){
                ansCount[1] ++;
            }
            if (student3[i%student3.length] == answers[i]){
                ansCount[2] ++;
            }
        }

        List<Integer> tempanswer = new ArrayList<>();
        
        int max = Arrays.stream(ansCount).max().getAsInt();
        
        for (int i = 0; i < ansCount.length; i++){
            if (ansCount[i] == max){
                tempanswer.add(i+1);
            }
        }
        int[] answer = tempanswer.stream().mapToInt(i -> i).toArray();
    
        return answer;
    }
}