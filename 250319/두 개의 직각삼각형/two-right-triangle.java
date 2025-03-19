import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i =0; i<N; i++){//행
            for(int j =N-i; j>0; j--){
                System.out.print("*");

            }
            for(int k =0; k<i; k++){
                System.out.print(" ");

            }
            for(int k =0; k<i; k++){
                System.out.print(" ");

            }
            for(int j =N-i; j>0; j--){
                System.out.print("*");

            }
            
            System.out.println("");
        }
    }
}