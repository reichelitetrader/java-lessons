package org.piotr.lesson6.objects.shop;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    enum Status {
        ACCEPTED(1), PROCESSING(2), REJECTED(3), DONE(4);

        private int number;

        Status(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
    private String number;
    private Status status;
    private Customer customer;
    private Cashier cashier;
    private BigDecimal price;
    private List<Product> products = new ArrayList<>();
}
