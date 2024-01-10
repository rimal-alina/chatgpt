import java.util.List;

public class MenuVO {
    private List<DishVO> dishes;

    public MenuVO(List<DishVO> dishes) {
        this.dishes = dishes;
    }

    public DishVO getDish(int index) {
        return dishes.get(index);
    }

    public List<DishVO> getDishes() {
        return dishes;
    }

    public void setDishes(List<DishVO> dishes) {
        this.dishes = dishes;
    }

    // Weitere Methoden nach Bedarf
}
