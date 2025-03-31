/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        String M = scanner.nextLine();

        int lengthN = N.length();
        int lengthM = M.length();
        int index=-1;
        for(int i =0; i<lengthN-lengthM+1; i++){
            if(index!=-1)break;
            for(int j=0; j<lengthM; j++){
                if(N.charAt(i+j)!=M.charAt(j)){
                    index=-1;
                    break;
                }
                if(j==0)index=i;
            }
        }
        System.out.print(index);
    }
}
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        String M = scanner.nextLine();

        System.out.println(N.indexOf(M));
    }
}