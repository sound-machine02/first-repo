import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a+b;
        System.out.println("Sum = "+s);
        sc.close();
    }
}