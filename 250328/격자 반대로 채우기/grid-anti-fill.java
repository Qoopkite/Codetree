import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] arr = new int[N][N];
        int cnt =1;
        int x=0;

        for (int i = N - 1; i >= 0; i--) {
            if (x%2== 0) {
                for (int j = N - 1; j >= 0; j--) {  
                    arr[j][i] = cnt;
                    cnt++;
                }
            } else {
                for (int j = 0; j < N; j++) {
                    arr[j][i] = cnt;
                    cnt++;
                }
            }
            x=x+1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}