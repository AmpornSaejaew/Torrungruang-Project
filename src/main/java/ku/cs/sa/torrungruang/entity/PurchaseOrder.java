package ku.cs.sa.torrungruang.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PurchaseOrder {
    @Id
    private long po_id;
}
