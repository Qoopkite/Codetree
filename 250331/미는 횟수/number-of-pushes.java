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
            }
                s=s.substring(s.length()-1)+s.substring(0,s.length()-1);
                cnt++;
        
        }

            System.out.println("-1");

    }
}