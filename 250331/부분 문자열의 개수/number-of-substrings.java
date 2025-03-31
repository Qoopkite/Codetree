import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int cnt =0;
        int length = A.length();
        for(int i=0; i<length-1; i++){
            if(A.charAt(i) == B.charAt(0) && A.charAt(i+1) == B.charAt(1)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}