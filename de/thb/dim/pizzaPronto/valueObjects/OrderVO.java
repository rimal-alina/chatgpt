import java.time.LocalDateTime;
import java.util.List;

public class OrderVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int nextId = 0;

    private int orderNo;
    private StateOfOrderVO state;
    private LocalDateTime timestampStartedOrder;
    private LocalDateTime timestampDeliveredOrder;
    private List<DishVO> shoppingBasket;
    private CustomerVO customer;

    public OrderVO(CustomerVO customer, MenuVO menu) {
        this.orderNo = ++nextId;
        this.state = StateOfOrderVO.STARTED;
        this.timestampStartedOrder = LocalDateTime.now();
        this.shoppingBasket = new ArrayList<>();
        this.customer = customer;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public StateOfOrderVO getState() {
        return state;
    }

    public void setState(StateOfOrderVO state) {
        this.state = state;
    }

    public LocalDateTime getTimestampStartedOrder() {
        return timestampStartedOrder;
    }

    public LocalDateTime getTimestampDeliveredOrder() {
        return timestampDeliveredOrder;
    }

    public void setTimestampDeliveredOrder(LocalDateTime timestampDeliveredOrder) {
        this.timestampDeliveredOrder = timestampDeliveredOrder;
    }

    public List<DishVO> getShoppingBasket() {
        return shoppingBasket;
    }

    public void setShoppingBasket(List<DishVO> shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public CustomerVO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerVO customer) {
        this.customer = customer;
    }

    // Weitere Getter und Setter nach Bedarf

    public void addDish(DishVO dish) {
        shoppingBasket.add(dish);
    }

    public void deleteDish(DishVO dish) {
        shoppingBasket.remove(dish);
    }

    public float calculatePriceDishes() {
        float totalPrice = 0.0f;
        for (DishVO dish : shoppingBasket) {
            totalPrice += dish.getPrice();
        }
        return totalPrice;
    }

    // Weitere Methoden nach Bedarf
}
