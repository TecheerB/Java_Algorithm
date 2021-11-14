import java.util.*;

public class marathon {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of participants: ");
        int num = sc.nextInt();
        String[] participants = new String[num];

        System.out.println("Type the name of participants: ");
        for(int i = 0; i<num; i++){
            participants[i] = sc.next();
        }

        String[] completions = new String[num-1];

        System.out.println("Type the name of the completed ones: ");
        for(int i = 0; i<num-1; i++){
            completions[i] = sc.next();
        }
        sc.close();

        System.out.println(solution(participants, completions));
    }

        public static String solution(String[] participant, String[] completion) {
            String answer = "";
        
            List<String> newCompletion= Arrays.asList(completion);
            List<String> newparticipant= Arrays.asList(participant);

            Collections.sort(newCompletion);
            Collections.sort(newparticipant);
            
            int index = 0;
            for (int i = 0; i< newCompletion.size(); i++){
                if (newCompletion.get(i).equals(newparticipant.get(i))==false){
                    index = i;
                    break;
                }
            }
            answer = newparticipant.get(index);

            return answer;
        }

}
