import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i]=='e'){
                arr[i]=' ';
                break;
            }
        }
        s = String.valueOf(arr);
        System.out.println(s.replaceAll(" ",""));
    }
}