import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        String[] numArr = num.split("-");

        System.out.println(numArr[0]+"-"+numArr[2]+"-"+numArr[1]);
    }
}