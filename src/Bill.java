/**
 * Created by cristian on 6/18/15.
 */
public class Bill {
    private long totalCost;
    private int[] discounts;
    private Order order;

    public void calculateTotalCost(){

    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }

    public int[] getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int[] discounts) {
        this.discounts = discounts;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
