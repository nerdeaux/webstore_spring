package com.nerdeaux.webstore.service;
import com.nerdeaux.webstore.domain.Cart;
import com.nerdeaux.webstore.dto.CartDto;

public interface CartService {
   
   void create(CartDto cartDto);
   
   Cart read(String cartId);
   
   void update(String cartId, CartDto cartDto);
   
   void delete(String id);

   void addItem(String cartId, String productId);

   void removeItem(String cartId, String productId);
   
   Cart validate(String cartId);

   void clearCart(String cartId);

}
