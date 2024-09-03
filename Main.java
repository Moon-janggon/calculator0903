import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a expression");
        a = input.nextInt();
        operator = input.next().charAt(0);
        b = input.nextInt();

        switch (operator) {
            case '+':
                c = add(a,b);
                System.out.println(c);
                break;

            case '*':
                c = mul(a, b);
                System.out.println(c);
                break;
        }


    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int mul(int a, int b)
    {
        return a * b;
    }
}
