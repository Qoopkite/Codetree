import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A>0){
            for(int i = 0; i < B; i++){
                System.out.print(A);
            }
        }else{
                System.out.print(0);
        }
    }
}