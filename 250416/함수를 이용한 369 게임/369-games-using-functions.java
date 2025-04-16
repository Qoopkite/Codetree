import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt=0;
        
        for(int i=A; i<=B; i++){
            if(MagicNum(i)){
                cnt++;
            }
            
        }
        System.out.println(cnt);
    }

    public static boolean MagicNum(int N){
        int x = N/10;
        int y= N%10;
        return N%3==0 || x==3 || x==6 || x==9 || y==3 || y==6 || y==9 ;

    }
}