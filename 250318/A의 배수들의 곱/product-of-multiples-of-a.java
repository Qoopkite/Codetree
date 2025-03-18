import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int prod = 1;

        for(int i = 1; i<=B; i++){
            if(i%A==0){
                prod=prod*i;
            }
        }
        System.out.println(prod);
    }
}