import java.util.ArrayList;
import java.util.List;

public class Ordering implements IOrdering {
    private static MenuVO menu = new MenuVO();
    private OrderVO currentOrder;
    private CustomerVO currentCustomer;

    public OrderVO startNewOrder(CustomerVO customer) throws NullPointerException {
        if (customer == null) {
            throw new NullPointerException("Customer cannot be null.");
        }
        currentOrder = new OrderVO(currentCustomer, menu);
        return currentOrder;
    }

    public void addDish(DishVO dish) throws IllegalStateException {
        if (currentOrder == null || currentOrder.getState() != StateOfOrderVO.STARTED) {
            throw new IllegalStateException("Order not started or in an invalid state.");
        }
        currentOrder.addDish(dish);
    }

    public void deleteDish(DishVO dish) throws IllegalStateException {
        if (currentOrder == null || currentOrder.getState() != StateOfOrderVO.STARTED) {
            throw new IllegalStateException("Order not started or in an invalid state.");
        }
        currentOrder.deleteDish(dish);
    }

    public float calculateTotalPrice() {
        if (currentOrder == null) {
            return 0.0f;
        }
        return currentOrder.calculatePriceDishes();
    }

    public void confirmOrder() throws IllegalStateException {
        if (currentOrder == null || currentOrder.getState() != StateOfOrderVO.STARTED) {
            throw new IllegalStateException("Order not started or in an invalid state.");
        }
        currentOrder.confirmOrder();
    }

    public OrderVO getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(OrderVO currentOrder) {
        this.currentOrder = currentOrder;
    }

    public CustomerVO getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(CustomerVO currentCustomer) {
        this.currentCustomer = currentCustomer;
    }

    public static MenuVO getMenu() {
        return menu;
    }

    public static void setMenu(MenuVO menu) {
        Ordering.menu = menu;
    }
}
