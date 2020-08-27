package com.nerdeaux.webstore.domain.repository;

import com.nerdeaux.webstore.domain.Order;

public interface OrderRepository {
   long saveOrder(Order order);
}
