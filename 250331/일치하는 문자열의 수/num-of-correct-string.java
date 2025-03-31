import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = scanner.next();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            if (s.equals(x)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
