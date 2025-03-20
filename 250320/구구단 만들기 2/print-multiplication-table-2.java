import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int B = b;
        int colunm =b-a+1;
        int cnt = 2;//2468
        for(int i = 0; i<4; i++){//행
            for(int j=0; j<colunm; j++){//열
                System.out.print(b+" * "+cnt+" = "+b*cnt);
                b--;
                if(b<a){
                    b=B;
                }
                if(j!=colunm-1){
                    System.out.print(" / ");
                }
            }
            System.out.println();
            cnt=cnt+2;
        }
    }
}