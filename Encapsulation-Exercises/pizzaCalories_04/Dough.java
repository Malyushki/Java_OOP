package pizzaCalories_04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        List<String> bakingTechniques = Arrays.stream(new String[]{"Crispy", "Chewy", "Homemade"}).collect(Collectors.toList());
        if (bakingTechniques.contains(bakingTechnique)) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight<1 || weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }else {
            this.weight = weight;
        }
    }

    public double calculateCalories() {
        double doughTypeModifier = 0;
        double flourTypeModifier = 0;
        switch (this.bakingTechnique) {
            case "Crispy":
                doughTypeModifier = 0.9;
                break;
            case "Chewy":
                doughTypeModifier = 1.1;
                break;
            case "Homemade":
                doughTypeModifier = 1;
                break;
        }
        switch (this.flourType) {
            case "White":
                flourTypeModifier = 1.5;
                break;
            case "Wholegrain":
                flourTypeModifier = 1;
                break;

        }
        return this.weight * flourTypeModifier * doughTypeModifier;

    }
}
