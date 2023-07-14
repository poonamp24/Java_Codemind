import java.util.*;

public class Frequency1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array : ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to find the Frequency  : ");
        int num = sc.nextInt();
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                freq++;
            }

        }

        System.out.println("The Frequency of " + num + " is " + freq);
    }
}