/**
 * Created by cristian on 6/18/15.
 */
public class Product {
    private int pruductId;
    private String category;
    private String description;
    private long price;
    private Order order;

    public int getPruductId() {
        return pruductId;
    }

    public void setPruductId(int pruductId) {
        this.pruductId = pruductId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
