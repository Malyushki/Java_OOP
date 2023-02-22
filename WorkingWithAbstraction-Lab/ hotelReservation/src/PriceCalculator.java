public class PriceCalculator {

    public static double priceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        double totalPrice = pricePerDay * numberOfDays;
        int seasonMultiplayer =season.multiplier;
        double discount = discountType.discount;
        return totalPrice*seasonMultiplayer*(1-discount/100);


    }
}
