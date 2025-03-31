import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[N];

        int cnt=0;
        int n=0;

        for(int i =0; i<N; i++){
            arr[i]=scanner.nextLine();
        }

        char X = scanner.next().charAt(0);

        for(int i=0; i<N; i++){
            if (arr[i].charAt(0)==X){
                cnt = cnt + arr[i].length();
                n++;
            }
        }
        
        double avg = (double)cnt/n;

        System.out.printf("%d %.2f",n,avg);
    }
}