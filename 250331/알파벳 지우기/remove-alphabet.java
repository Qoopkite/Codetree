import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();
        String X ="";
        String Y ="";

        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();

        for(int i =0; i<arrA.length; i++){
            if('0'<=arrA[i]&& arrA[i]<='9'){
                X=X+arrA[i];
            }
        }
        for(int i =0; i<arrB.length; i++){
            if('0'<=arrB[i]&& arrB[i]<='9'){
                Y=Y+arrB[i];
            }
            
        }
        System.out.print(Integer.parseInt(X)+Integer.parseInt(Y));
    }
}