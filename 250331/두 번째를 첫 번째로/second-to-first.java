import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] arr = s.toCharArray();

        char x = arr[0];
        char y = arr[1];

        System.out.print(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arr[i]== y){
                arr[i]=x;
            }
            System.out.print(arr[i]);
        }
        
    }
}