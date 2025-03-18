import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while(true){
            int age = scanner.nextInt();
            if(age>=30){
                break;
            }
            sum = sum + age;
            cnt++;
        }
        System.out.printf("%.2f",(double)sum/cnt);
    }
}