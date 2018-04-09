package com.zulucoda.springmvc.springmvc.controllers;

import com.zulucoda.springmvc.springmvc.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * Created by Muzikayise Flynn Buthelezi (zulucoda) on 2018/04/09
 */
@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customers")
    public String getAllCustomers(Model model){
        model.addAttribute("customers", customerService.getAllCustomers());

        return "/customers";
    }

}
