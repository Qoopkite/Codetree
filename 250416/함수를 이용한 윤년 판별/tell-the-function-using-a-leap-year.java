import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.

        if(func(y)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static boolean func(int Y){
        if(Y%100==0 && Y%400!=0){
            return false;
        }
        if(Y%4==0){
            return true;
        }else{
            return false;
        }
    }
}