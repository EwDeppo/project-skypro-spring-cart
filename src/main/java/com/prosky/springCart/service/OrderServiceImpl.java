package com.prosky.springCart.service;

import com.prosky.springCart.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderDto orderDto;

    public OrderServiceImpl(OrderDto orderDto) {
        this.orderDto = orderDto;
    }

    @Override
    public List<Integer> addOrder(List<Integer> ids) {
        orderDto.addItems(ids);
        return ids;
    }

    @Override
    public List<Integer> getOrder() {
        return orderDto.getIds();
    }
}
