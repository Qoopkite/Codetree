import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        if(A%3==0||A%5==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}