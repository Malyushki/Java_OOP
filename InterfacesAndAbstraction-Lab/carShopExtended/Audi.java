package carShopExtended;

public class Audi extends CarImpl implements Rentable {



    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String country,Integer minRentDay, Double pricePerDay) {
        super(model,color,horsePower,country);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("This is %s produced in %s and have %d tires", getModel(), countryProduced(), TIRES))
                .append(System.lineSeparator())
                .append(String.format("Minimum rental period of %d days. Price per day %f", minRentDay, pricePerDay));
        return sb.toString();
    }




    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return getPricePerDay();
    }
}

