import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;
        int N = scanner.nextInt();

        for (int i = 1; N > 0; i++) {
            N = N / i;
            cnt++;
        }

        System.out.println(cnt);
    }
}
