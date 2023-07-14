import java.util.*;

class sumOfNaturalNum {
    void CalSum(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res = res + i;
        }
        System.out.println("Addition of Natural Number is : " + res);
    }

    public static void main(String args[]) {
        sumOfNaturalNum sn = new sumOfNaturalNum();
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sn.CalSum(num);
    }
}