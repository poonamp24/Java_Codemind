import java.util.*;

public class CopyArray1 {
    public static void main(String[] args) {
        ArrayList<String> main = new ArrayList<>();
        main.add("Raj");
        main.add("rama");
        main.add("Pooja");
        main.add("Viraj");
        main.add("Soham");
        main.add("Ayush");
        main.add("Pramod");
        System.out.println("\n Original array list:-" + main);
        ArrayList<String> copiedList = new ArrayList<>();
        for (String item : main) {
            copiedList.add(item);
        }
        System.out.println("\n Copied Array List:-" + copiedList);
    }

}