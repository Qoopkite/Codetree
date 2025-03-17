import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        if(A>B){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
                if(A>C){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
                if(A>D){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
                if(A>E){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}