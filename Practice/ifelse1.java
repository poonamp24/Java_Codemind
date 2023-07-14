import java.util.*;

class ifelse1 {
    public static void main(String args[]) {

        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Given Number is Even");

        } else {
            System.out.println("Given Number is Odd");
        }
    }

}