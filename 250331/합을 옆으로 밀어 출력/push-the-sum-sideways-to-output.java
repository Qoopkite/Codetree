import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum=0;
        String Ssum="";

        for(int i=0; i<N; i++){
            int x = scanner.nextInt();
            sum=sum+x;
        }
        Ssum = Integer.toString(sum);

        Ssum = Ssum.substring(1)+Ssum.substring(0,1);
        System.out.print(Ssum);
        
        
    }
}