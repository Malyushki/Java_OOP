package pizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping>toppings;

    public Pizza(String name, Dough dough) {
        this.name = name;
        this.dough = dough;
        toppings = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = new ArrayList<>();
    }
}
