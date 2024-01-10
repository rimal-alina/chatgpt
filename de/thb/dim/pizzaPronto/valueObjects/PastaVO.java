import java.util.Objects;

public class PastaVO extends DishVO {
    private int typeOfPasta;

    public PastaVO(int number, String name, float price, int typeOfPasta) {
        super(number, name, price);
        this.typeOfPasta = typeOfPasta;
    }

    public int getTypeOfPasta() {
        return typeOfPasta;
    }

    public void setTypeOfPasta(int typeOfPasta) {
        this.typeOfPasta = typeOfPasta;
    }

    @Override
    public String getNameOfDish() {
        // Implementierung je nach Bedarf
        return getName();
    }

    @Override
    public int getNumberOfDish() {
        // Implementierung je nach Bedarf
        return getNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PastaVO)) return false;
        PastaVO pastaVO = (PastaVO) o;
        return getTypeOfPasta() == pastaVO.getTypeOfPasta() && getNumber() == pastaVO.getNumber() && Objects.equals(getName(), pastaVO.getName()) && Float.compare(pastaVO.getPrice(), getPrice()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeOfPasta(), getNumber(), getName(), getPrice());
    }

    // Weitere Methoden nach Bedarf
}
