import java.util.*;

public class HashsetToArray {
    public static void main(String[] args) {

        HashSet<String> h_set = new HashSet<String>();

        h_set.add("Riya");
        h_set.add("Ganesh");
        h_set.add("Chhaya");
        h_set.add("Sanjay");
        h_set.add("Pinky");
        h_set.add("Yash");
        System.out.println("\nOriginal Hash Set: " + h_set);

        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array);

        System.out.println("\nArray elements: \n ");
        for (String element : new_array) {
            System.out.println(element);
        }
    }
}