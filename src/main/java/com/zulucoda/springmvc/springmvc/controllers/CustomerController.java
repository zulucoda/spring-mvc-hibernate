package com.zulucoda.springmvc.springmvc.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zulucoda.springmvc.springmvc.domain.Customer;
import com.zulucoda.springmvc.springmvc.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/customer/{id}")
    public String getCustomerById(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));

        return "/customer";
    }

    @RequestMapping("/customer/new")
    public String addCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "/customerform";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public String saveOrUpdate(Customer customer){
        customerService.saveOrUpdate(customer);
        return "redirect:/customers";
    }

    @RequestMapping("/customer/edit/{id}")
    public String editCustomer(@PathVariable Integer id, Model mode){
        mode.addAttribute("customer", customerService.getCustomerById(id));
        return "/customerform";
    }

    @RequestMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomerById(id);
        return "redirect:/customers";
    }

}
