import java.util.*;

class checkCharacter {
    public static void main(String args[]) {
        System.out.println("Enter Any Character : ");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Entered character is in Lower Case");
        }

        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Entered character is in Upper Case");
        } else {
            System.out.println("Please enter valid Character");
        }
    }
}