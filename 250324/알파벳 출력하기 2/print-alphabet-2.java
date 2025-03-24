import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A=65;

        for(int i =0; i<N; i++){
            for(int j=65; j<65+N; j++){
                if(j==65){
                    for(int k = 0; k<i; k++){
                        System.out.print("  ");
                        j++;
                    }
                }
                System.out.print((char)A+" ");
                A++;
                if(A==91){//Z다음 A
                    A=65;
                }
            }
            System.out.println();
        }
    }
}