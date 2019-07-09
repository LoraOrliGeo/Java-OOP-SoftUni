package WorkingWithAbstraction.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int[] coordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int x1 = coordinates[0];
        int y1 = coordinates[1];
        int x2 = coordinates[2];
        int y2 = coordinates[3];

        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);

        Rectangle rectangle = new Rectangle(first, second);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rectangle.contains(point));
        }
    }
}
