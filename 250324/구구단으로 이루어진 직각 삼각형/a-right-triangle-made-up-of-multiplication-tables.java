import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0; i<N; i++){
            int k=1;
            for(int j = i; j<N; j++){
                System.out.print((i+1)+" * "+k+" = "+((i+1)*k));
                if(j!=N-1){
                    System.out.print(" / ");
                }
                k++;
            }
            System.out.println();
        }
    }
}