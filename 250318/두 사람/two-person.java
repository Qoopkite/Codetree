import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int age1 = scanner.nextInt();
        String sex1 = scanner.next();
        int age2 = scanner.nextInt();
        String sex2 = scanner.next(); //enxtLine이랑 next랑 머가다른데

        if((age1 >=19 && sex1.equals("M")) || (age2 >=19 && sex2.equals("M"))){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}