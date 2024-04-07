package com.example.medimateserver.service.impl;

import com.example.medimateserver.dto.OrderDto;
import com.example.medimateserver.entity.Orders;
import com.example.medimateserver.repository.OrderRepository;
import com.example.medimateserver.service.OrderService;
import com.example.medimateserver.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<OrderDto> findAll() {
        List<Orders> ordersList = orderRepository.findAll();
        return ordersList.stream()
                .map(order -> ConvertUtil.gI().toDto(order, OrderDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public OrderDto findById(Integer id) {

        return orderRepository.findById(id)
                .map(order -> ConvertUtil.gI().toDto(order, OrderDto.class))
                .orElse(null);
    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        Orders savedOrders = ConvertUtil.gI().toEntity(orderDto, Orders.class);
        savedOrders.setStatus(1);
        savedOrders = orderRepository.save(savedOrders);

        return ConvertUtil.gI().toDto(savedOrders, OrderDto.class);
    }

    @Override
    public OrderDto update(Integer id, OrderDto orderDto) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<OrderDto> findByIdUser(Integer id) {
        List<Orders> ordersList = orderRepository.findByIdUser(id);
        return ordersList
                .stream()
                .filter(order -> order.getStatus() != 0) // Filter out orderes with status 0
                .map(order -> ConvertUtil.gI().toDto(order, OrderDto.class))
                .collect(Collectors.toList());
    }

}
