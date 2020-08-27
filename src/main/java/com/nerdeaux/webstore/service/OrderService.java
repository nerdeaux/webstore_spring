package com.nerdeaux.webstore.service;

import com.packt.webstore.domain.Order;

public interface OrderService {

   Long saveOrder(Order order);
}
