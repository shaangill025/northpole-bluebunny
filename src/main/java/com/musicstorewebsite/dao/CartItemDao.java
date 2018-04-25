package com.northpole.dao;

import com.northpole.model.Cart;
import com.northpole.model.CartItem;

/**
 * Created by Le on 1/23/2016.
 */
public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem (CartItem cartItem);

    void removeAllCartItems (Cart cart);

    CartItem getCartItemByProductId (int productId);
}
