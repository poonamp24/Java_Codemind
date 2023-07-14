import java.util.*;

class findNumber {
    void FindNo(int num) {
        if (num > 0) {
            System.out.println(num + " is Positive Number");
        } else if (num < 0) {
            System.out.println(num + " is Negative Number");
        } else {
            System.out.println("Enter valid Number");
        }
    }

    public static void main(String args[]) {
        findNumber fn = new findNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        fn.FindNo(num);
    }
}