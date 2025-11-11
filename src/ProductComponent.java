//This is the base class for both Products and Categories.
abstract class ProductComponent {

    // Adds a product or category — optional for leaf objects
    // I can say: “Not every class will use this, but Categories will override it.”
    public void add(ProductComponent component) {
        throw new UnsupportedOperationException();
    }

    // Gets the name of the product or category
    // Every product or category will have a name
    public String getName() {
        throw new UnsupportedOperationException();
    }

    // Gets the price of a product (or total price if it’s a category)
    // Products will have a price, categories might calculate totals
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    // Displays details for the product or category
    // This is the main action that both types share — showing info
    public void display() {
        throw new UnsupportedOperationException();
    }
}

/* Instead of forcing every subclass to implement all methods
(even when some don’t make sense), we give the base class
default methods that throw an exception when used incorrectly */