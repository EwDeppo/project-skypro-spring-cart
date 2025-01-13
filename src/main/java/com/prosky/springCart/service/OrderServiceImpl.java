package com.prosky.springCart.service;

import com.prosky.springCart.dto.OrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderDAO orderDAO;

    public OrderServiceImpl(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public List<Integer> addOrder(List<Integer> ids) {
        orderDAO.addItems(ids);
        return ids;
    }

    @Override
    public List<Integer> getOrder() {
        return orderDAO.getIds();
    }
}
