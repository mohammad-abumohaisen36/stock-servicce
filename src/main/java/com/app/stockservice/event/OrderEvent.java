package com.app.stockservice.event;



import com.app.stockservice.dto.OrderDto;
import com.app.stockservice.event.enums.EventStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderEvent implements Serializable {

    private String message;
    private EventStatus eventStatus;
    private OrderDto order;
    private String id;
}
