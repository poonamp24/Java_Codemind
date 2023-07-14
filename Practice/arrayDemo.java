import java.uitl.*;

class arrayDemo {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int min = arr[0];
        int max = arr[0];
        System.out.println("Elements in Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Aleternate Elements in Array :");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }

        System.out.println("Number of Elements in Array :" + arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Smallest Elements in Array :" + min);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Largest Elements in Array :" + max);
    }
}