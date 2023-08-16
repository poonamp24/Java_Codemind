import java.util.ArrayList;
import java.util.Scanner;

public class CheckArrayListNoExists {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(88);
        al.add(22);
        al.add(52);
        al.add(40);
        al.add(10);
        al.add(77);
        al.add(8);

        System.out.println("Enter Value to be search : ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        boolean isExist = al.contains(val);

        if (isExist) {
            System.out.println("The element is present in the ArrayList");
        } else {
            System.out.println("The element not present in the ArrayList");
        }
    }

}