
package greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] itemArr = scanner.nextLine().split("\\s+");
        Bag bag = new Bag(capacity);

        for (int i = 0; i < itemArr.length; i += 2) {
            String itemName = itemArr[i];
            long quantity = Long.parseLong(itemArr[i + 1]);
            Item currentItem = Item.isItem(itemName, quantity);

            if (currentItem.getType() != null && bag.checkBagCapacity(quantity)) {

                switch (currentItem.getType()) {
                    case Gem:
                        if (bag.getGemSum() + quantity > bag.getGoldSum()) {
                            continue;
                        }
                        break;
                    case Cash:

                        if (bag.getCashSum() + quantity > bag.getGemSum()) {
                            continue;
                        }

                        break;
                }

                bag.addItem(currentItem);
            }
        }
        System.out.println(bag);

    }
}