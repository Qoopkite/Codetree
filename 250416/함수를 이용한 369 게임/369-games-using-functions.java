import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (isMagicNumber(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isMagicNumber(int N) {
        // 3의 배수면 true
        if (N % 3 == 0) return true;

        // 문자열로 변환 후 포함 여부 확인
        String str = Integer.toString(N);
        return str.contains("3") || str.contains("6") || str.contains("9");
    }
}
