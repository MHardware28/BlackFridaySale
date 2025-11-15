public class Main {
    public static void main(String[] args) {
        // Composite pattern - creates structure but still allows for individuality
        Category electronics = new Category("Electronics");
        electronics.add(new Product("Laptop", 999.99));
        electronics.add(new Product("Smartphone", 799.99));

        Category clothing = new Category("Clothing");
        clothing.add(new Product("Sweater", 49.99));
        clothing.add(new Product("Jeans", 59.99));

        Category blackFridayDeals = new Category("Black Friday Deals");
        blackFridayDeals.add(electronics);
        blackFridayDeals.add(clothing);

        blackFridayDeals.display();

        // Observer pattern - adding and notifying all customers of a deal
        BlackFridayDeals deals = new BlackFridayDeals();
        Customers c1 = new Customers("Alice");
        Customers c2 = new Customers("Bob");
        Customers c3 = new Customers("Makayla");

        System.out.println(" ");
        deals.registerCustomer(c1);
        deals.registerCustomer(c2);
        deals.registerCustomer(c3);

        c3.unsubscribe();


        deals.notifyCustomers("50% off all electronics!");
    }
}