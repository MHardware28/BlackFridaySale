class Customers {
    private String name;
    private boolean subscribed;

    public Customers(String name) {
        this.name = name;
        this.subscribed = true; // default: subscribed
    }

    public String getName() {
        return name;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void unsubscribe() {
        this.subscribed = false;
    }

    public void receiveNotification(String deal) {
        if (subscribed) {
            System.out.println("Dear " + name + ", New deal available! " + deal);
        } else {
            System.out.println("Customer " + name + " is not subscribed to deal notifications.");
        }
    }
}

