import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int L =0;
        int R =0;


        for(int i=0; i<B.length(); i++){
            if(B.charAt(i)=='L'){
                L++;
            }else{
                R++;
            }
        }
        
        if(L>R){//L만큼 왼쪽밀기
        int x=L-R;
        A = A.substring(x)+A.substring(0, x);
        System.out.print(A);
        }else if(R<L){//R만큼 오른쪽밀기
        int x=R-L;
        A = A.substring(A.length()-x)+A.substring(0, A.length()-x);
        System.out.print(A);
        }else{//L과 R개수 동일 할 때
        System.out.print(A);
        }
        

    }
}