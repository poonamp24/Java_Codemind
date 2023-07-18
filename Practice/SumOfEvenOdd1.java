import java.util.*;

class SumOfEvenOdd1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[7];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int num : arr1) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Addition of Even num : " + sumEven);
        System.out.println("Addition of Odd num : " + sumOdd);
    }

}