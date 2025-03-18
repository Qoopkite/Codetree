import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int N = scanner.nextInt();

        int i = 0;
        while(i<N){
            A=A+N;
            System.out.println(A);
            i++;
        }
    }
}