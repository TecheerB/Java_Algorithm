import java.util.*;

public class NoDuplicates {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();

        String[] splited = sentence.split(" ");

        Set<String> str = new HashSet<String>();

        String ret = "yes";
        for(String s: splited){
            if(str.add(s)==false){
                ret = "no";
                break;
            }
        }
        System.out.println(ret);


    }
}
