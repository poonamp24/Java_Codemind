import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Raj");
        ll.add("Riya");
        ll.add("Lata");
        ll.add("Priya");
        ll.add("Anjali");

        System.out.println("Original linked list:" + ll);

        Iterator it = ll.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
