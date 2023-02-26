package shoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.length()<1 || name.equals("\\s+")|| name.equals("null")){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void buyProduct(Product product) {
        if (this.money<product.getCost()){
            System.out.printf("%s can't afford %s%n",getName(),product.getName());
        }else {
            this.setMoney(this.money-product.getCost());
            this.products.add(product);
            System.out.printf("%s bought %s%n",getName(),product.getName());

        }

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (this.products.isEmpty()){
            return String.format("%s - Nothing bought",getName());
        }else {
            StringBuilder sb = new StringBuilder(getName());
            sb.append(" - ").append(this.products.toString().replaceAll("[\\[\\]]",""));
            return sb.toString().trim();
        }
    }
}
