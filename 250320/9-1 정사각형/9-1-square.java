import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cnt =9;
        
        for(int i = 0; i<N; i++){//행개수
            for(int j =0; j<N; j++){//열개수
                System.out.print(cnt);
                cnt--;
                if(cnt==0){
                    cnt=9;
                }
            }
            System.out.println();
        }
        
    }
}