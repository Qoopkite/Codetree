import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int cnt=0;
        for(int i = 0; i < 5; i++){
            int N = scanner.nextInt();
            if(N%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}