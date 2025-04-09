import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n<m){//n을 더 큰수로 만들기
            int tmp=n;
            n=m;
            m=tmp;
        }
        
        int gcd = GCD(n, m);
        int lcm = n*m/gcd;

        System.out.println(lcm);

    }
    static int GCD(int N, int M){
        for(;;){//최대공약수 찾기
            if(N%M==0){
                return M;
            }else{
                int x=M;
                M=N%M;
                N=x;
            }
        }
    }
}