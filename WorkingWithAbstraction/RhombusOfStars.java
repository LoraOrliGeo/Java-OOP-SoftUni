package WorkingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(getRow(" ", n - i));
            System.out.println(getRow("* ", i));
        }

        for (int i = n - 1; i > 0; i--) {
            System.out.print(getRow(" ", n - i));
            System.out.println(getRow("* ", i));
        }
    }

    public static String getRow(String input, int n){
        String result = "";

        for (int i = 0; i < n; i++) {
            result += input;
        }

        return result;
    }
}
