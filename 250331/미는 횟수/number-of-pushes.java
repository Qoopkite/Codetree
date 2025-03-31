import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String t = scanner.next();
        int cnt =0;

        for(int i=0; i<s.length(); i++){
            if(s.equals(t)){
                System.out.print(cnt);
                return;
            }else{
                t=t.substring(t.length()-1)+t.substring(0,t.length()-1);
                cnt++;
            }
        }

            System.out.println("-1");

    }
}