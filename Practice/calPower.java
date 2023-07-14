import java.util.*;

public class calPower {
    void CalculatePower(int base, int exponent) {
        int res = 1;
        while (exponent != 0) {
            res = res * base;
            exponent--;
        }
        System.out.println("Number of Power is :" + res);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Base : ");
        int base = sc.nextInt();

        System.out.println("Enter value of Exponent : ");
        int exponent = sc.nextInt();

        calPower cp = new calPower();
        cp.CalculatePower(base, exponent);

    }
}