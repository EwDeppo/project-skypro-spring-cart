package com.prosky.springCart.dto;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class OrderDto {
    private final List<Integer> ids;

    public OrderDto() {
        this.ids = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> idList) {
        ids.addAll(idList);
        return idList;
    }

    public List<Integer> getIds() {
        return Collections.unmodifiableList(ids);
    }
}
