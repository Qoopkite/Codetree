import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] arr = new int [N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i==0 || j==0){
                    arr[i][j]=1;
                    continue;
                }
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j]+arr[i][j-1];
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}