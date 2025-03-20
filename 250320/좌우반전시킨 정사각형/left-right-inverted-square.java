import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i=0; i<N; i++){
            for(int j =N; j>0; j--){
                System.out.print((i+1)*j+" ");
            }



            System.out.println();
        }
    }
}