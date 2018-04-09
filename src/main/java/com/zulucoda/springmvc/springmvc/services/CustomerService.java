package com.zulucoda.springmvc.springmvc.services;

import com.zulucoda.springmvc.springmvc.domain.Customer;

import java.util.List;

/***
 * Created by Muzikayise Flynn Buthelezi (zulucoda) on 2018/04/09
 */
public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Integer id);

    void saveOrUpdate(Customer customer);
}
