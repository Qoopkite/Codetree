import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cnt = 1;
        for(int i =1; i<=N; i++){
            for(int j =1; j<=N; j++){
                if(i%2==0){
                    cnt++;
                }
                System.out.print(cnt+" ");
                cnt++;

            }
            System.out.println();
        }
    }
}