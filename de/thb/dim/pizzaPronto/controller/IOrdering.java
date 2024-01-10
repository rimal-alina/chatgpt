public interface IOrdering {
    OrderVO startNewOrder(CustomerVO customer) throws NullPointerException;
    void addDish(DishVO dish) throws IllegalStateException;
    void deleteDish(DishVO dish) throws IllegalStateException;
    float calculateTotalPrice();
    void confirmOrder() throws IllegalStateException;
}
