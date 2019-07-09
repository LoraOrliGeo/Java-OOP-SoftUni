package Encapsulation.P01_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length = Double.parseDouble(sc.nextLine());
        double width  = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(box);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
