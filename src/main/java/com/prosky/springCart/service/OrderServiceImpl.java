package com.prosky.springCart.service;

import com.prosky.springCart.dto.OrderDto;
import com.prosky.springCart.entity.Item;
import com.prosky.springCart.repository.OrderCache;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final HashMap<String, Integer> counters = new HashMap<>();

    private final OrderCache orderCache;

    @Override
    public String addOrder(String clientId, OrderDto orderDto) {

        Integer idCounter = counters.getOrDefault(clientId, 0);

        Item item = new Item();
        item.setId(idCounter);
        item.setName(orderDto.getName());
        item.setCost(item.getCost());

        idCounter++;
        counters.put(clientId, idCounter);

        return orderCache.addOrder(clientId, item);
    }

    @Override
    public List<String> getOrderIds(String clientId) {
        return orderCache.getOrderIds(clientId).stream().map(Object::toString).collect(Collectors.toList());
    }

}