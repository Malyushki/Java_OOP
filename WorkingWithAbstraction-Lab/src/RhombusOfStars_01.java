import java.util.Scanner;

public class RhombusOfStars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printRowFirstPart(n);
        printRowSecondPart(n);




    }

    public static void printRowFirstPart(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = n - i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void printRowSecondPart(int n ) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = n - i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


