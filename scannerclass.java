import java.util.*;
public class scannerclass {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("enter a value");
        int a = r.nextInt();
        System.out.println("enter b value");
        int b = r.nextInt();
        System.out.println("Task Below");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        int x = r.nextInt();
        switch (x) {
            case 1:
                System.out.println("Addition of" + a + "and" + b + "is" + (a + b));
                break;
            case 2:
                System.out.println("Substraction of" + a + "and" + b + "is" + (a - b));
                break;
            case 3:
                System.out.println("Multiplication of" + a + "and" + b + "is" + (a * b));
                break;
            case 4:
                System.out.println("Division of" + a + "and" + b + "is" + (a / b));
                break;
            case 5:
                System.out.println("Modulus of" + a + "and" + b + "is" + (a % b));
                break;
            default:System.out.println("Invalid");
        }
        r.close();
    }
}

