import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i<N; i++){//상체
                for(int j = N-1; j>i; j--){
                    System.out.print(" ");
                }

                System.out.print("*");

                for(int k = 0; k<i; k++){
                    System.out.print(" "+"*");
                }

                for(int j = N-1; j>i; j--){
                    System.out.print(" ");
                }

        System.out.println("");
        }

        for(int i = 0; i<N-1; i++){//하체
                for(int j = 0; j<=i; j++){
                    System.out.print(" ");
                }

                System.out.print("*");

                for(int k = 0; k<N-i-2; k++){
                    System.out.print(" "+"*");
                }

                for(int j = 0; j<=i; j++){
                    System.out.print(" ");
                }
        System.out.println("");   
        }

    }
}
