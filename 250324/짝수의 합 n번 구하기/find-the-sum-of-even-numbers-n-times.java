import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sum = new int[N];

        for(int i =0; i<N; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            while(a<=b){
                if(a%2==1){
                    a++;
                }
                sum[i]=sum[i]+a;
                a=a+2;
            }
        }
        for(int i=0;i<N; i++){
        System.out.println(sum[i]);
        }
    }
}