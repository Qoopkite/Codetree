import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        for(;A<=B; A=A+2){
            if(A==B){
                System.out.print(A);
                break;
            }
            System.out.print(A+" ");
        }
    }
}