package WorkingWithAbstraction.P05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimestions[0];
        int cols = dimestions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = value++;
            }
        }

        String command = "";

        long sum = 0;

        while (!"Let the Force be with you".equals(command = scanner.nextLine())) {
            int[] ivoCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (validateIndex(evilRow, evilCol, matrix)) {
                    matrix[evilRow][evilCol] = 0;
                }

                evilRow--;
                evilCol--;
            }

            int ivoRow = ivoCoordinates[0];
            int ivoCol = ivoCoordinates[1];

            while (ivoRow >= 0 && ivoCol < matrix[1].length) {
                if (validateIndex(ivoRow, ivoCol, matrix)) {
                    sum += matrix[ivoRow][ivoCol];
                }

                ivoRow--;
                ivoCol++;
            }
        }

        System.out.println(sum);
    }

    public static boolean validateIndex(int row, int col, int[][] matrix){
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }
}
