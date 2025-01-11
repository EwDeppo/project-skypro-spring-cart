package com.prosky.springCart.service;

import com.prosky.springCart.dto.OrderDto;

import java.util.List;

public interface OrderService {
    String addOrder(String clientId, OrderDto orderDto);

    List<String> getOrderIds(String clientId);
}
