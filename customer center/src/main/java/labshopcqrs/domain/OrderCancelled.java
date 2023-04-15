package labshopcqrs.domain;

import java.util.*;
import labshopcqrs.infra.AbstractEvent;
import lombok.Data;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}
