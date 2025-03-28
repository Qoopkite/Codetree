import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N= scanner.nextInt(); //격자 크기
        int M= scanner.nextInt(); //점개수

        int[][] arr = new int[N][N];

        for(int i=0; i<M; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            arr[x-1][y-1]=x*y;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}