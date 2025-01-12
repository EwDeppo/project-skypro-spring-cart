package com.prosky.springCart.controller;

import com.prosky.springCart.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public List<Integer> addOrder(@RequestParam List<Integer> ids) {
        return orderService.addOrder(ids);
    }

    @GetMapping(path = "/get")
    public List<Integer> getOrder() {
        return orderService.getOrder();
    }
}
