import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        
        for(int i=0; i<10; i++){
            int N =scanner.nextInt();
            if(N%3==0){
                break;
            }
            arr[0] = N;
        }
        System.out.println(arr[0]);
    }
}