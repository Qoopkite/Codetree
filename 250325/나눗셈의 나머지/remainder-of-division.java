import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] R= new int[B];
        int sum=0;
        while(A>1){
            R[A%B]=R[A%B]+1;
            A=A/B;
        }
        for(int i =0; i<B; i++){
            sum = sum + R[i]*R[i];
        }
        System.out.println(sum);
    }
}