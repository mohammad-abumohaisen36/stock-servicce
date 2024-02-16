package com.app.orderservice.event;


import com.app.orderservice.dto.OrderDto;
import com.app.orderservice.event.enums.EventStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
@Data
public class OrderEvent {

    private String message;
    private EventStatus eventStatus;
    private OrderDto order;
}
