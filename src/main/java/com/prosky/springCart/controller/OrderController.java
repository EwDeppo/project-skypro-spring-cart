package com.prosky.springCart.controller;

import com.prosky.springCart.dto.OrderDto;
import com.prosky.springCart.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/add")
    public String addOrder(@RequestHeader String clientId,
                           @RequestBody OrderDto orderDto) {
        return orderService.addOrder(clientId, orderDto);
    }

    @GetMapping("/get")
    public List<String> getOrders(@RequestHeader String clientId) {
        return orderService.getOrderIds(clientId);
    }

}