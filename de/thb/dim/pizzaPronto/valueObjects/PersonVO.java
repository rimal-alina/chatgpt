import java.util.Objects;

public abstract class PersonVO {
    protected String firstName;
    protected String lastName;
    protected String street;
    protected int houseNumber;

    public PersonVO(String firstName, String lastName, String street, int houseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public abstract String getFullName();

    public abstract void setFullName(String fullName);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonVO)) return false;
        PersonVO personVO = (PersonVO) o;
        return getHouseNumber() == personVO.getHouseNumber() && getFirstName().equals(personVO.getFirstName()) && getLastName().equals(personVO.getLastName()) && getStreet().equals(personVO.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getStreet(), getHouseNumber());
    }

    @Override
    public String toString() {
        return "PersonVO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    // Weitere Methoden nach Bedarf
}
