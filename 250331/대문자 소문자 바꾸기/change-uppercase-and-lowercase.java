import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        char[] arr = s.toCharArray();

        for(int i=0; i< arr.length; i++){
            if('A'<= arr[i] && arr[i]<='Z'){//대문자인경우
                arr[i]=(char)(arr[i]-'A'+'a');
            }else{//소문자인경우
                arr[i]=(char)(arr[i]-'a'+'A');
            }
            System.out.print(arr[i]);
        }
        
    }
}