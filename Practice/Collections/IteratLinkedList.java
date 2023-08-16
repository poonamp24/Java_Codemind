import java.util.*;

public class IteratLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Poonam");
        ll.add("Raj");
        ll.add("Shrikant");
        ll.add("Prachi");
        ll.add("Ram");
        System.out.println("By Using Iterator:-");
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\nUsing For Each loop:-");
        for (String item : ll) {
            System.out.println(item);
        }
    }

}