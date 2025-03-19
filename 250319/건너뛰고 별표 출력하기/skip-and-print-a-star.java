import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("");
        }
        for(int i = 1; i<=N-1; i++){
            for(int k=1; k<=N-i; k++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("");
        }
    }
}