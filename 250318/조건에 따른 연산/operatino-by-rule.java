import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cnt = 0;

        for(;;){
            if(N>=1000){
            break;
            }
        if(N%2==0){
            N=N*3+1;
        }else{
            N=N*2+2;
        }
        cnt++;
        }
        System.out.println(cnt);

    }
}