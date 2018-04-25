package com.northpole.service;

import com.northpole.model.Cart;

/**
 * Created by Le on 1/24/2016.
 */
public interface OrderHistoryService {

    void addOrderHistoryByCart(Cart cart);
}
