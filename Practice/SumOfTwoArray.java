import java.util.*;

public class SumOfTwoArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int arr1size = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int arr2size = sc.nextInt();

        if (arr1size != arr2size) {
            System.out.println("Both array must have " + "same number of elements");
            return;
        }

        int array1[] = new int[arr1size];
        int array2[] = new int[arr1size];
        int array3[] = new int[arr1size];

        System.out.println("Enter first array elements: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < array3.length; i++) {

            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Resultant Array: "
                + Arrays.toString(array3));
    }
}