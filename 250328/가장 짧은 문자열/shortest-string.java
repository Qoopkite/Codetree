import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int min=20;
        int max=0;

        for(int i=0; i<3; i++){
            String str = scanner.next();
            int x = str.length();
            if(max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
        }
        System.out.print(max-min);
    }
}