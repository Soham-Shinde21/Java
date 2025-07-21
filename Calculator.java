package Practice;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CALCULATOR");
        System.out.println("Enter the operation to be done: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        System.out.println("Enter two nos. "); 
            int a = sc.nextInt();   
            int b = sc.nextInt();
        switch (button) {
            case 1:
               System.out.println(a+b);
                break;
            case 2:
               System.out.println(a-b);
                break;
            case 3:
               System.out.println(a*b);
                break;
            case 4:
               System.out.println(a/b);
                break;

                default:
                System.out.println("Invalid Operation");
                break;
        }
        sc.close();
    }
}
