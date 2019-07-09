package WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {

    public static double calculate(ReservationDetails details) {
        double price = details.getPricePerDay() * details.getDays();

        price = price * details.getSeason().getValue();
        price *= 1 - details.getDiscountType().getDiscount();
        return price;
    }
}