import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0 ; i<N; i++){//전체 행
            for(int j=0; j<N-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
            for(int k=0; k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println("");
            
        }
    }
}