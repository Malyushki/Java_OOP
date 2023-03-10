package carShopExtended;

public class Seat extends CarImpl implements Sellable {


    private Double price;

    public Seat(String model, String color, Integer horsePower, String country, Double price) {
        super(model,color,horsePower,country);
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("This is %s produced in %s and have %d tires", getModel(), countryProduced(), TIRES))
                .append(System.lineSeparator())
                .append(String.format("%s sells for %f", getModel(), price));
        return sb.toString();
    }


    @Override
    public Double getPrice() {
        return price;
    }
}

