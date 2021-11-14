import java.util.*;

public class kthInt{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type the numbers of elements you want to store: ");
        int num = sc.nextInt();
        int[] nums = new int[num];
        
        System.out.println("Type the elements: ");
        for(int i = 0; i<num; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Type number of cases you want to test: ");
        int cases = sc.nextInt();
        int[][] test = new int[cases][3];

        System.out.println("Type the elements for each cases: ");
        for(int i = 0; i<cases; i++){
            for ( int j = 0; j < 3; j++){
                test[i][j] = sc.nextInt();
            }
        }

        sc.close();
        int [] finalanswer = solution(nums, test);
        System.out.println();
        System.out.print('[');
        for(int i: finalanswer){
            
            if(i == finalanswer[cases-1]){
                System.out.print(i);
            }else{
                System.out.print(i + ",");
            }
        }
        System.out.print(']');

    }

    public static int[] solution (int [] array, int[][] commands){
        int row = commands.length;
        int[] answer = new int [row];
        for (int i = 0;  i < row; i++){
            int[] newarr = Arrays.copyOfRange(array, (commands[i][0] - 1) , (commands[i][1]));
            Arrays.sort(newarr); 
            answer[i] = newarr[commands[i][2] - 1];
        }
        
        return answer; 
    }
}
