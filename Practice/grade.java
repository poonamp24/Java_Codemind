import java.util.*;

class grade {
    public static void main(String args[]) {
        System.out.println("Enter Your Marks :");
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();

        if (Marks > 80) {
            System.out.println("Your Grade is A");

        } else if (Marks > 60 && Marks < 80) {
            System.out.println("Your Grade is B");
        } else if (Marks > 50 && Marks < 60) {
            System.out.println("Your Grade is C");
        }

        else if (Marks > 45 && Marks < 50) {
            System.out.println("Your Grade is D");
        }

        else if (Marks > 25 && Marks < 45) {
            System.out.println("Your Grade is E");
        }

        else {
            System.out.println("Your Grade is F");
        }

    }
}