import java.util.*;

public class HashSetNoExistExample {
    public static void main(String[] args) {

        HashSet<Integer> hset = new HashSet<Integer>();

        hset.add(110);
        hset.add(55);
        hset.add(115);
        hset.add(10);
        hset.add(63);

        System.out.println("Hash set Elements: " + hset);

        System.out.println("Does the Set contains '110'? :- " + hset.contains(110));

        System.out.println("Does the Set contains '555'? :- " + hset.contains(555));
    }
}