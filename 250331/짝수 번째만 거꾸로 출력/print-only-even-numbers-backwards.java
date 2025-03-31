import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

    String X = scanner.nextLine();

    int length = X.length();

    for(int i =length-1; i>0; i--){
        if(i%2==1){
            System.out.print(X.charAt(i));
        }
    }
    }
}