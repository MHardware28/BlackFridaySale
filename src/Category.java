import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Category extends ProductComponent {
    private String name;
    private List<ProductComponent> components = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    @Override
    public void add(ProductComponent component) {
        components.add(component);
    }

    @Override
    public String getName() { return name; }

    @Override
    public void display() {
        System.out.println("\nCategory: " + name);
        for (ProductComponent component : components) {
            component.display();
        }
    }
}
