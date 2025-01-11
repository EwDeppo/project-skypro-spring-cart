package com.prosky.springCart.repository;

import com.prosky.springCart.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public final class OrderCache {

    private final HashMap<String, List<Item>> ordersCache = new HashMap<>();

    public String addOrder(String clientId, Item item) {
        List<Item> clientItems = ordersCache.getOrDefault(clientId, new ArrayList<>());
        clientItems.add(item);
        ordersCache.put(clientId, clientItems);
        return String.format(
                "Заказ на названием %s был создан на складе. Ему присвоен идентификатор %s",
                item.getName(),
                item.getId()
        );
    }

    public List<Integer> getOrderIds(String clientId) {
        return ordersCache.get(clientId).stream().map(it -> it.getId()).collect(Collectors.toList());
    }

}