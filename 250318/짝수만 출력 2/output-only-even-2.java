import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int A = scanner.nextInt();

        while(B>=A){
            if(B==A){
                System.out.print(B);
                break;
            }
            System.out.print(B+" ");
            B=B-2;
        }
    }
}