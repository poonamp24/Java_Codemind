import java.util.*;

class HashSetIterationExampleForeach {
    public static void main(String[] args) {

        HashSet<String> h = new HashSet<String>();

        h.add("Poonam");
        h.add("Pratiksha");
        h.add("Omkar");

        for (String i : h)
            System.out.println(i);
    }
}
