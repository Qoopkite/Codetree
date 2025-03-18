import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int[] arr = new int[N];
        int j =0;
        for(int i = 0; i<N; i++){
            int n = scanner.nextInt();
            if(n%3==0&&n%2==1){
                arr[j]=n;
                j++;
            }
        }
        for(int i=0; i<j; i++){
            System.out.println(arr[i]);
        }
    }
}