package chengang.com.chapter2;


import java.util.ArrayList;
import java.util.Arrays;

public class Ex15 {
    private ArrayList<Item> items = new ArrayList<>();

    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double price() {
            return quantity * unitPrice;
        }
        @Override
        public String toString() {
            return String.format("description: %s, quantity: %d, unitPrice: %.2f", description, quantity, unitPrice);
        }
    }

    void addItem(String description, int quantity, double unitPrice) {
        Item item = new Item();
        item.description = description;
        item.quantity =  quantity;
        item.unitPrice = unitPrice;
        items.add(item);
    }

    @Override
    public String toString() {
        return Arrays.toString(items.toArray());
    }

    public static void main(String[] args) {
        Ex15 ex15 = new Ex15();
        ex15.addItem("apple", 2, 8.2);
        ex15.addItem("meat", 7, 8.2);
        System.out.println(ex15);
    }

}
