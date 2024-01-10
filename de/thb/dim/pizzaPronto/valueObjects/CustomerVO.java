import java.time.LocalDate;

public class CustomerVO extends PersonVO {
    private static int nextId = 0;
    private int id;
    private LocalDate dateOfBirth;
    private OrderVO order;

    public CustomerVO(String firstName, String lastName, String street, int houseNumber, LocalDate dateOfBirth) {
        super(firstName, lastName, street, houseNumber);
        this.id = ++nextId;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public OrderVO getOrder() {
        return order;
    }

    public void setOrder(OrderVO order) {
        this.order = order;
    }

    // Weitere Getter und Setter nach Bedarf
}
