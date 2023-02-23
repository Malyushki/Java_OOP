package greedyTimes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bag {
    long capacity;
    private List<Item> bagList;


    public Bag(long capacity) {
        this.capacity = capacity;
        this.bagList = new ArrayList<>();

    }

    public List<Item> getGoldList() {
        return bagList.stream().filter(a -> a.getType().equals(Type.Gold)).collect(Collectors.toList());
    }

    public List<Item> getGemsList() {
        return bagList.stream().filter(a -> a.getType().equals(Type.Gem)).collect(Collectors.toList());
    }

    public List<Item> getCashList() {
        return bagList.stream().filter(a -> a.getType().equals(Type.Cash)).collect(Collectors.toList());
    }


    public long getGoldSum() {
        long sum = 0;
        for (Item item : this.getGoldList()) {
            sum += item.getQuantity();
        }
        return sum;
    }

    public long getCashSum() {
        long sum = 0;
        for (Item item : this.getCashList()) {
            sum += item.getQuantity();
        }
        return sum;
    }

    public long getGemSum() {
        long sum = 0;
        for (Item item : this.getGemsList()) {
            sum += item.getQuantity();
        }
        return sum;
    }

    public boolean checkBagCapacity(long newItemValue) {
        return this.capacity >= getGemSum() + getGoldSum() + getCashSum() + newItemValue;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Create a list of types for which there are items in the bag
        List<Type> types = bagList.stream()
                .map(Item::getType)
                .distinct()
                .sorted(Comparator.comparingLong(this::getTotalAmount).reversed())
                .collect(Collectors.toList());

        for (Type type : types) {
            // Get the items of the current type and sort them alphabetically by name
            List<Item> items = bagList.stream()
                    .filter(item -> item.getType().equals(type))
                    .sorted(Comparator.comparing(Item::getItemName).reversed()
                            .thenComparing(Item::getQuantity))
                    .collect(Collectors.toList());

            // Calculate the total amount of items of the current type
            long totalAmount = items.stream()
                    .mapToLong(Item::getQuantity)
                    .sum();

            // Append the type and total amount to the string builder
            sb.append("<").append(type).append("> $").append(totalAmount).append(System.lineSeparator());

            // Append each item of the current type to the string builder
            for (Item item : items) {
                sb.append("##").append(item.getItemName()).append(" - ").append(item.getQuantity()).append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }

    // Helper method to calculate the total amount of items of a given type
    private long getTotalAmount(Type type) {
        return bagList.stream()
                .filter(item -> item.getType().equals(type))
                .mapToLong(Item::getQuantity)
                .sum();
    }

    public void addItem(Item item) {
        if (item.getType().equals(Type.Gold) && !bagList.isEmpty()) {
            Item tempItem = null;
            for (Item i : bagList) {
                if (i.getType().equals(item.getType())) {
                    tempItem = i;
                }
            }
            int indexOfGold = bagList.indexOf(tempItem);
            long newValue = bagList.get(indexOfGold).getQuantity() + item.getQuantity();
            bagList.get(indexOfGold).setQuantity(newValue);
        } else {
            this.bagList.add(item);
        }
    }
}
