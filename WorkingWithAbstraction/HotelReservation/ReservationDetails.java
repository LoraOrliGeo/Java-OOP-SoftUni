package WorkingWithAbstraction.HotelReservation;

public class ReservationDetails {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discountType;

    public ReservationDetails(double pricePerDay, int days, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }
}
