import java.util.*;

public class contacts {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        sc.close();

        String[] num = numbers.split(",");
        System.out.println(solution(num));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book,Comparator.comparing(String :: length));

        for(int i=0; i<phone_book.length; i++){
            for(int j = i+1; j < phone_book.length; j++){
                if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))){
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}
