import java.util.List;

public class Order {
    /*
    * Class of Order
    */

    private String customerName;
    private String shippingAddress;
    private int numItems;

    public Order(OrderBuilder builder) {
        this.customerName = builder.getCustomerName();
        this.shippingAddress = builder.getShippingAddress();
        this.numItems = builder.getNumItems();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public int getItems() {
        return numItems;
    }
}
