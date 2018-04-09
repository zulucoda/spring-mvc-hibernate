package com.zulucoda.springmvc.springmvc.services;

import com.zulucoda.springmvc.springmvc.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/***
 * Created by Muzikayise Flynn Buthelezi (zulucoda) on 2018/04/09
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<Integer, Customer> customers;

    public CustomerServiceImpl(){
        loadCustomer();
    }

    private void loadCustomer() {
        this.customers = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Muzikayise");
        customer1.setLastName("Buthelezi");
        customer1.setEmailAddress("muzi@mfbproject.co.za");
        customer1.setAddressLineOne("Some Address Line One");
        customer1.setAddressLineTwo("Some Address Line Two");
        customer1.setPhoneNumber("058 123 1234");
        customer1.setCity("Silicone Oasis");
        customer1.setState("Dubai");
        customer1.setZipCode("UAE480400");
        this.customers.put(1, customer1);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Flynn");
        customer2.setLastName("ZuluCoda");
        customer2.setEmailAddress("zulucoda@mfbproject.co.za");
        customer2.setAddressLineOne("Some Address Line One");
        customer2.setAddressLineTwo("Some Address Line Two");
        customer2.setPhoneNumber("052 123 1234");
        customer2.setCity("International City");
        customer2.setState("Dubai");
        customer2.setZipCode("UAE380400");
        this.customers.put(2, customer2);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(this.customers.values());
    }

    @Override
    public Customer getCustomerById(Integer id){
        return this.customers.get(id);
    }

    @Override
    public void saveOrUpdate(Customer customer){
        Integer nextKey = getNextKey();
        customer.setId(nextKey);
        this.customers.put(nextKey, customer);
    }

    private Integer getNextKey() {
        Integer nextKey = 0;
        for (Customer customer : this.customers.values()){
            nextKey = customer.getId();
        }
        return nextKey + 1;
    }
}
