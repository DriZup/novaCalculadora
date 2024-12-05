import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String op = sc.next();

        int result;

        result = op.equals ("1")  ? num1 + num2 :
                op.equals ("2") ? num1 - num2 :
                        op.equals("3") ? num1 / num2 :
                                op.equals( "4") ? num1 * num2 : 0;

        System.out.println(result);

        sc.close();

    }
}
