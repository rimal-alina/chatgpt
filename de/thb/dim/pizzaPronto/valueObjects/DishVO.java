import java.io.Serializable;

public abstract class DishVO implements Comparable<DishVO>, Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private int number;
    private String name;
    private float price;

    public DishVO(int number, String name, float price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract String getNameOfDish();
    public abstract int getNumberOfDish();

    public int compareTo(DishVO otherDish) {
        return this.name.compareTo(otherDish.name);
    }

    public DishVO clone() {
        try {
            return (DishVO) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Weitere Getter und Setter nach Bedarf
}
