package com.prosky.springCart.service;

import java.util.List;

public interface OrderService {
    List<Integer> addOrder(List<Integer> ids);

    List<Integer> getOrder();
}
