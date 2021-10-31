package Programmers;
import java.util.*;
public class k번째 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int order =0;
        for (int x=0; x <commands.length; x++){
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];

            int[] range = new int[j-i+1];

            int z = 0;
            for(int y=i-1; y<j; y++){
                range[z++]=array[y];
            }
            Arrays.sort(range);
            answer[order++]=range[k-1];
        }
        return answer;
    }
}