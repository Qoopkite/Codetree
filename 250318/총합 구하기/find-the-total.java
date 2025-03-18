import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;
        for(;A<=B;A++){
            if(A%6==0 && A%8!=0){
                sum = sum + A;
            }
        }
        System.out.println(sum);
    }
}