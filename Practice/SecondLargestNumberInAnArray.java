public class SecondLargestNumberInAnArray {
    public static void main(String args[]) {
        int temp, size;
        int arr[] = { 25, 10, 35, 15, 45 };
        size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Second largest number is:: " + arr[size - 2]);
    }
}
