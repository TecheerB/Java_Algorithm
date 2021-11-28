import java.io.*;

public class problem2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<N; i++){
            int number = i;
            int sum = 0;

            while(number != 0){
                sum += number % 10;
                number /= 10;
            }

            if(sum+i == N){
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
        
    }
}
