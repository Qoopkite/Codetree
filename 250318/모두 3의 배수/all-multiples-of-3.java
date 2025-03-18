import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int x =1;
        for(int i=0; i<5; i++){
            int n = scanner.nextInt();
            if(n%3!=0){
                x=0;
                break;
            }
        }
        System.out.println(x);
    }
}