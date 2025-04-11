import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x = n/10;
        int y = n%10;

        if(n%2==0){
            if(func(x, y)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }


    }
    public static boolean func(int x, int y){
        return (x+y)%5==0;
    }
}