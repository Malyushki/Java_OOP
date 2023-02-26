package pizzaCalories_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        List<String> toppingTypes = Arrays.stream(new String[]{"Meat", "Veggies", "Cheese","Sauce"}).collect(Collectors.toList());
        if (toppingTypes.contains(toppingType)) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",toppingType));
        }

    }

    private void setWeight(double weight) {
        if (weight<1 || weight>50){
            throw new IllegalArgumentException(String.format("%.2f weight should be in the range [1..50].",weight));
        }else {
            this.weight = weight;
        }
    }

    private double calculateCalories() {
        double toppingModifier = 0;
        switch (this.toppingType) {
            case "Meat":
                toppingModifier = 1.2;
                break;
            case "Veggies":
                toppingModifier = 0.8;
                break;
            case "Cheese":
                toppingModifier = 1.1;
                break;
            case "Sauce":
                toppingModifier = 0.9;
                break;
        }

        return this.weight * 2 * toppingModifier;
    }
}
