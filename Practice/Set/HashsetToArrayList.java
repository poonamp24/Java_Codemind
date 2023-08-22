import java.util.*;

public class HashsetToArrayList {
    public static void main(String[] args) {

        HashSet<String> h_set = new HashSet<String>();

        h_set.add("Riya");
        h_set.add("Ganesh");
        h_set.add("Chhaya");
        h_set.add("Sanjay");
        h_set.add("Pinky");
        h_set.add("Yash");
        System.out.println("Original Hash Set: " + h_set);

        List<String> list = new ArrayList<String>(h_set);

        System.out.println("ArrayList contains: " + list);
    }
}