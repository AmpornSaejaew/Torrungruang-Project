package ku.cs.sa.torrungruang.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue
    private long id;

    private double totalPrice;
    private LocalDate orderDate;
    private double vat;
    private int paymentStatus;
}
