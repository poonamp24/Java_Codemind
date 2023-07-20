public class CatTest {
    public static void main(String args[]) {
        cat c = new cat();

        c.feed();
        c.sleep();
        c.play();

        System.out.println("Energy " + c.getEnergy());

        System.out.println("Hungry " + c.getHungry());

        System.out.println("Mood " + c.getMood());
    }
}