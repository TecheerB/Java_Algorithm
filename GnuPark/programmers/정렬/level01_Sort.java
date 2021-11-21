package programmers.정렬;

import java.util.*;

public class level01_Sort {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] command = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0, k = commands[i][0]; j <= commands[i][1] - commands[i][0]; j++, k++) {
                command[j] = array[k - 1];
            }
            Arrays.sort(command);
            answer[i] = command[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        int[] answer = {};
        answer = solution(array, commands);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
    }
}
