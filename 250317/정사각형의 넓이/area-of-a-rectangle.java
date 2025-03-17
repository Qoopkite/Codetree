import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N<5){
            System.out.println(N*N);
            System.out.println("tiny");
        }else{
            System.out.println(N*N);
        }
    }
}