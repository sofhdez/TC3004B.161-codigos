public class OrderBuilder {
    /*
    * Class of OrderBuilder
    */

    private String customerName;
    private String shippingAddress;
    private int numItems;

    public OrderBuilder(String customerName) {
        this.customerName = customerName;
    }

    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public OrderBuilder setItems(int numItems) {
        this.numItems = numItems;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public int getNumItems() {
        return numItems;
    }

    public Order build() {
        return new Order(this);
    }
}
