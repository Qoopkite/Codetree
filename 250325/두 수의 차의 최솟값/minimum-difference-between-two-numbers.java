import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] arr = new int[N];
    int min=100;

    for(int i=0; i<N; i++){
        arr[i]=scanner.nextInt();
    }
    for(int i=0; i<N; i++){
        for(int j=i+1; j<N; j++){
            if(min>Math.abs(arr[i]-arr[j])){
                min=Math.abs(arr[i]-arr[j]);
            }
        }
    }
    System.out.println(min);
    }
}