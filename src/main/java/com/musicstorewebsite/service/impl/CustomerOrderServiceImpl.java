package com.northpole.service.impl;

import com.northpole.dao.CustomerOrderDao;
import com.northpole.model.Cart;
import com.northpole.model.CartItem;
import com.northpole.model.CustomerOrder;
import com.northpole.service.CartService;
import com.northpole.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Le on 1/23/2016.
 */

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal=grandTotal+item.getTotalPrice();
        }

        return grandTotal;
    }
}
