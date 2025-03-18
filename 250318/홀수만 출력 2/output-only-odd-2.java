import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int A = scanner.nextInt();

        for(;A<=B; B=B-2){
            if(A==B){
                System.out.print(B);
                break;
            }
            System.out.print(B+" ");
        }
    }
}