import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        func(n);
    }
    static void func(int N){
        int sum =0;
        for(int i=1; i<=N; i++){
            sum = sum +i;
        }
        System.out.println(sum/10);
    }
}