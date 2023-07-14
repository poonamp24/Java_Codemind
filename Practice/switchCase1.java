import java.util.*;

class switchCase1 {
    public static void main(String args[]) {
        System.out.println("Enter any Character:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println(ch + " is a vowel");
                break;

            case 'e':
                System.out.println(ch + " is a vowel");
                break;

            case 'i':
                System.out.println(ch + " is a vowel");
                break;

            case 'o':
                System.out.println(ch + " is a vowel");
                break;

            case 'u':
                System.out.println(ch + " is a vowel");
                break;

            default:
                System.out.println(ch + " is a Consonant");
                break;
        }

    }
}