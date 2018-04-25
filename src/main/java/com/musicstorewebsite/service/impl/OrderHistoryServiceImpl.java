package com.northpole.service.impl;

import com.northpole.dao.OrderHistoryDao;
import com.northpole.model.Cart;
import com.northpole.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Le on 1/24/2016.
 */

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService{

    @Autowired
    private OrderHistoryDao orderHistoryDao;

    public void addOrderHistoryByCart (Cart cart) {
       orderHistoryDao.addOrderHistoryByCart(cart);
    }

}
