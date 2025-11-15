import java.util.ArrayList;
import java.util.List;

class BlackFridayDeals {
    private List<Customers> customers = new ArrayList<>();

    public void registerCustomer(Customers customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customers customer) {
        customers.remove(customer);
    }

    public void notifyCustomers(String deal) {
        for (Customers customer : customers) {
            customer.receiveNotification(deal);
        }
    }
}
