import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A>B){
            int temp=A;
            A=B;
            B=temp; //이제 A보다는 B가 큼
        }
        if(B>C){
            int temp=B;
            B=C;
            C=temp; //이제 B보다는 C가 큼
        }

        System.out.println(B);
    }
}