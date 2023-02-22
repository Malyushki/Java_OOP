public enum DiscountType {
    NONE(0),
    SECONDVISIT(10),
    VIP(20);

    double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }
}
