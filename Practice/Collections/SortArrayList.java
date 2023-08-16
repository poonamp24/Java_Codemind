import java.util.*;

public class SortArrayList {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Poonam");
        list.add("Omkar");
        list.add("Pratiksha");
        list.add("Prajyot");
        list.add("Rushikesh");
        list.add("Ayush");
        list.add("Sayama");
        list.add("Ketan");

        System.out.println("Before Sorting: " + list);

        Collections.sort(list);

        System.out.println("After Sorting: " + list);
    }
}