import java.util.*;

class GrestestNo {
    void FindGreatestNo(int num, int num1) {
        if (num > num1) {
            System.out.println(num + " is Greatest Number");
        } else {
            System.out.println(num1 + " is Greatest Number");
        }
    }

    public static void main(String args[]) {
        GrestestNo gn = new GrestestNo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num1 = sc.nextInt();

        gn.FindGreatestNo(num, num1);
    }
}