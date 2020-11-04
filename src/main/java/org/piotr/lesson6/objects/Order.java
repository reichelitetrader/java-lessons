package org.piotr.lesson6.objects;
import java.math.BigDecimal;

public class Order {
    enum Status {
        ACCEPTED, REJECTED, PROCESSING, DONE
    }
    private Person person;
    private BigDecimal price;
    private Status status;

    public Order(Person person, BigDecimal price, Status status) {
        this.person = person;
        this.price = price;
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }
    public void updateStatus(Status newStatus) {
        System.out.printf("Status zamowienia zmieniono z %s na %s\n", this.status, newStatus);
        this.status = newStatus;
    }
    @Override
    public String toString() {
        return "Order{" +
                "person=" + person +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
