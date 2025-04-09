import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int min = func(a,b,c);
        System.out.println(min);
    
    }
    static int func(int A, int B, int C){
        int min =100;
        if(A<min){
            min = A;
        }
        if(B<min){
            min = B;
        }
        if(C<min){
            min = C;
        }
        return min;
    }
}