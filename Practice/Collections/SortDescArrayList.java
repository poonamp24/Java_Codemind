import java.util.*;

public class SortDescArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(22);
        al.add(64);
        al.add(16);
        al.add(55);
        al.add(11);
        al.add(89);
        al.add(98);
        al.add(73);

        al.sort(Collections.reverseOrder());
        System.out.println(al);
    }

}