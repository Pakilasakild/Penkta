import java.util.Scanner;

public class Main {
    public static Integer close10(int a, int b){
        if (Math.abs(a) == Math.abs(b)){
            return 0;
        }
        else if (Math.abs(10 - a) < Math.abs(10 - b)){
            return a;
        }
        else {
            return b;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(close10(a,b));
    }
}