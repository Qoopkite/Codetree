import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N =scanner.nextInt();

        int cnt=0;
        int n =0;
        for(int i=0; i<N; i++){
            int x = scanner.nextInt();
            if(x==2){
                cnt++;
                if(cnt==3){
                    n=i+1;
                    break;
                }
            }
        }
        System.out.print(n);
    }
}