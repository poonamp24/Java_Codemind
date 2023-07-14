import java.util.*;

public class Loops1 {
    public static void main(String args[]) {
        int num = 0;
        int num1 = 0;

        System.out.println("\n *********************WHILE LOOP*************************** ");
        System.out.println("Numbers are : ");
        while (num < 10) {
            System.out.println(num);
            num++;
        }

        System.out.println("\n ********************* DO WHILE LOOP*************************** ");
        System.out.println("Numbers are : ");

        do {
            System.out.println(num1);
            num1++;
        } while (num1 < 10);

        System.out.println("\n ********************* FOR LOOP*************************** ");
        System.out.println("Numbers are : ");
        for (int num2 = 0; num2 < 10; num2++) {
            System.out.println(num2);

        }
    }
}