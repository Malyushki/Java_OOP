//60/100

package shoppingSpree_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personsList = new ArrayList<>();
        List<Product> productsList = new ArrayList<>();

        fillPersonsList(scanner, personsList);

        fillProductsList(scanner, productsList);

        String command = scanner.nextLine();
        while (!command.equals("END")){
            String currentPersonName = command.split("\\s+")[0];
            String currentProductName = command.split("\\s+")[1];
            Person currentPerson = null;
            Product currentProduct = null;


            for (Person person:personsList) {
               if(person.getName().equals(currentPersonName)) {
                   currentPerson = person;
                   break;
               }
            }
            for (Product product:productsList) {
                if(product.getName().equals(currentProductName)) {
                    currentProduct = product;
                    break;
                }
            }

            currentPerson.buyProduct(currentProduct);

            command = scanner.nextLine();
        }

       personsList.forEach(System.out::println);

    }

    private static void fillPersonsList(Scanner scanner, List<Person> personsList) {
        String[] persons = scanner.nextLine().split(";");
        for (String person : persons) {
            String name = person.split("=")[0];
            int money = Integer.parseInt(person.split("=")[1]);
            personsList.add(new Person(name, money));

        }
    }

    private static void fillProductsList(Scanner scanner, List<Product> productsList) {
        String[] products = scanner.nextLine().split(";");
        for (String product : products) {
            String name = product.split("=")[0];
            int cost = Integer.parseInt(product.split("=")[1]);
            productsList.add(new Product(name,cost));

        }
    }
}
