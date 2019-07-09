package WorkingWithAbstraction.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2]);
        DiscountType discount = DiscountType.valueOf(tokens[3]);

        ReservationDetails reservationDetails = new ReservationDetails(pricePerDay, days, season, discount);
        System.out.printf("%.2f", PriceCalculator.calculate(reservationDetails));
    }
}
