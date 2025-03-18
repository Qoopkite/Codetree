import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int x = 0;
        for(int i = A ; i<=B; i++){
            if(1920%i==0 && 2880%i==0){
                x=1;
            }
        }
        System.out.println(x);
    }
}