class Customers {
    private String name;

    public Customers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveNotification(String deal) {
        System.out.println(name + " received deal: " + deal);
    }
}
