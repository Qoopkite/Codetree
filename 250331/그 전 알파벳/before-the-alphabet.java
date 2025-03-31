import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        char x = scanner.nextLine().charAt(0);
        if(x=='a'){
            x='z';
        }else{
            x--;
        }

        System.out.printf("%c",x);
    }
}