package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String itemId;
    private Integer qty;
    private String address;
}
