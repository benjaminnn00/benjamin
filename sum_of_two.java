import java.util.*;
public class sum_of_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Please Enter a first Number:");
        a = scanner.nextInt();
        System.out.println("Please Enter a second Number:");
        b = scanner.nextInt();
        sum = a+b;
        System.out.print("Sum of "+ a + " and " + b + " is " + sum);
    }
}
