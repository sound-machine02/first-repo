import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("Sum = "+sum);
    }
}