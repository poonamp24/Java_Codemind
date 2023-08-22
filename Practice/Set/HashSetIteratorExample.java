import java.util.*;

public class HashSetIteratorExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("Radha");
        set.add("Vijay");
        set.add("Monika");
        set.add("Arati");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}