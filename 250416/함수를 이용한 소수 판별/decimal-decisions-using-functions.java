import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =0;
        
        for(int i=a; i<=b; i++){
            if(magicnum(i)){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static boolean magicnum(int N){
        for(int i=2; i<N; i++){
            if(N%i==0){
                return false;
            }
        }
        return true;

    }
}