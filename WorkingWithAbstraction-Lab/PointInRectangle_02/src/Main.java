import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] coordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bottomLeftX = coordinates[0];
        int bottomLeftY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];
        Point pointBottomLeft = new Point(bottomLeftX,bottomLeftY);
        Point pointTopRight = new Point(topRightX,topRightY);
        Rectangle rectangle = new Rectangle(pointBottomLeft,pointTopRight);

        int points = Integer.parseInt(scanner.nextLine());
        for (int point = 1; point <=points ; point++) {
            int[] coordinatesOfPoint = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point pointToCheck = new Point(coordinatesOfPoint[0],coordinatesOfPoint[1]);
            System.out.println(rectangle.contains(pointToCheck));


        }
    }
}
