import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        int cnt =0;
        for(int i=0; i<N; i++){
            int n = scanner.nextInt();
            if(n%2==0){
                arr[cnt]=n;
                cnt++;
            }
        }
        for(int i =cnt-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}