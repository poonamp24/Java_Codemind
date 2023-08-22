import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Riya");
        tree_set.add("Ganesh");
        tree_set.add("Omkar");
        tree_set.add("Vasu");
        tree_set.add("Kajal");
        System.out.println("Tree set: ");
        System.out.println(tree_set);

        Object first_element = tree_set.first();
        System.out.println("First Element is: " + first_element);

        Object last_element = tree_set.last();
        System.out.println("Last Element is: " + last_element);
    }
}