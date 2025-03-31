import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        if((A+B).equals(B+A)){
            System.out.print("true");
        }else{
             System.out.print("false");
        }
    }
}