package greedyTimes;

public class Item {
    private String itemName;
    private Type type;
    private long quantity;

    public Item(String itemName, long quantity, Type type) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.type = type;
    }

    public String getItemName() {
        return itemName;
    }


    public Type getType() {
        return type;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }


    public static Item isItem(String itemName, long quantity) {
        if ((itemName.length() == 3)) {
            Type typeCash = Type.Cash;
            return new Item(itemName, quantity, typeCash);
        } else if (itemName.toLowerCase().endsWith("gem")&& itemName.length()>=4) {
            Type typeGem = Type.Gem;
            return new Item(itemName, quantity, typeGem);
        } else if (itemName.equalsIgnoreCase("gold")) {
            Type typeGold = Type.Gold;
            return new Item(itemName, quantity, typeGold);
        }

        return new Item(null, -1, null);
    }

    @Override
    public String toString() {
        return String.format("##%s - %d", getItemName(), getQuantity());
    }
}
