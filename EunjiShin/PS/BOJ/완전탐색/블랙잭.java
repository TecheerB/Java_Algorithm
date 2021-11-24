import java.io.*;
import java.util.StringTokenizer;

public class problem2798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] number = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int n=j+1; n<N; n++){
                    int numberSum = number[i] + number[j] + number[n];
                    sum = (numberSum > sum)&&(M >= numberSum) ? numberSum : sum;
                }
            }
        }

        System.out.println(sum);


    }
}
