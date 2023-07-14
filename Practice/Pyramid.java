import java.util.*;

class Pyramid {
    void PrintStar(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pyramid p = new Pyramid();
        System.out.println("Enter the number of Row : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        p.PrintStar(row);

    }
}