package com.northpole.controller.admin;

import com.northpole.model.Customer;
import com.northpole.model.Product;
import com.northpole.service.CustomerService;
import com.northpole.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Le on 1/23/2016.
 */

@Controller
@RequestMapping("/admin")
public class AdminHome {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String adminPage() {
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model) {
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);

        return "productInventory";
    }

    @RequestMapping("/customer")
    public String customerManagement(Model model) {
        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute(customerList);

        return "customerManagement";
    }
}
