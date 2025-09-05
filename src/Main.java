public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══");
        System.out.println("\nCreating orders and adding items...");

        Order o1 = new Order("Alice Johnson");
        addItemToOrder(o1, "Pizza", 12.99);
        addItemToOrder(o1, "Burger", 8.50);
        addItemToOrder(o1, "Fries", 3.25);

        Order o2 = new Order("Bob Smith");
        addItemToOrder(o2, "Sandwich", -6.25);  // Invalid price

        Order o3 = new Order("Bob Smith");
        addMultipleItemsToOrder(o3, new String[]{"Soup", "Salad", "Juice"}, 5.50, 3.00, 2.50);

        Order o4 = new Order("Charlie Brown");
        addItemToOrder(o4, "", 4.00);  // Invalid item (empty string)

        Order o5 = new Order("Emma Watson");
        addMultipleItemsToOrder(o5, new String[]{"Pizza", "Coke", "Burger", "Fries", "Ice Cream", "Water"}, 12.99, 1.50, 8.00, 3.25, 5.00, 1.00);

        Order o6 = new Order("Bob Smith");
        addMultipleItemsToOrder(o6, new String[]{"Taco", "Soda"}, 10.00);  // Price count mismatch

        Order o7 = new Order("Charlie Brown");
        addMultipleItemsToOrder(o7, new String[]{"Taco", "Juice"}, 14.50, 2.50);

        Order o8 = new Order("Alice Johnson");
        addItemToOrder(o8, "Cake", 3.99);  // This shouldn't be allowed (invalid customer)

        System.out.println("\nOrder Results:");
        System.out.println(o1.displayOrder());
        System.out.println(o2.displayOrder());
        System.out.println(o3.displayOrder());
        System.out.println(o4.displayOrder());
        System.out.println(o5.displayOrder());
        System.out.println(o6.displayOrder());
        System.out.println(o7.displayOrder());
        System.out.println(o8.displayOrder());

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        Order largest = o1;
        if (o2.getTotalAmount() > largest.getTotalAmount()) largest = o2;
        if (o3.getTotalAmount() > largest.getTotalAmount()) largest = o3;
        if (o4.getTotalAmount() > largest.getTotalAmount()) largest = o4;
        if (o5.getTotalAmount() > largest.getTotalAmount()) largest = o5;
        if (o6.getTotalAmount() > largest.getTotalAmount()) largest = o6;
        if (o7.getTotalAmount() > largest.getTotalAmount()) largest = o7;
        if (o8.getTotalAmount() > largest.getTotalAmount()) largest = o8;

        System.out.println("Largest order: " + largest.getCustomerName() + " ($" +
                String.format("%.2f", largest.getTotalAmount()) + ")");
    }

    private static void addItemToOrder(Order order, String item, double price) {
        try {
            order.addItem(item, price);
            System.out.println("Item '" + item + "' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding item '" + item + "': " + e.getMessage());
        }
    }

    private static void addMultipleItemsToOrder(Order order, String[] items, double... prices) {
        try {
            order.addMultipleItems(items, prices);
            System.out.println("Items added: " + String.join(", ", items));
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding items: " + e.getMessage());
        }
    }
}
