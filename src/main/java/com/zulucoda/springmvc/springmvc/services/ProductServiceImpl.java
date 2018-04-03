package com.zulucoda.springmvc.springmvc.services;

import com.zulucoda.springmvc.springmvc.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * Created by Muzikayise Flynn Buthelezi (zulucoda) on 2018/04/03
 */
@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer, Product> products;

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(this.products.values());
    }
    
    private void loadProducts(){
        this.products = new HashMap<>();
        
        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Alfa Romeo Guilia");
        product1.setPrice(new BigDecimal("600000.00"));
        product1.setImageUrl("http://www.alfaromeo.com/guilia");

        this.products.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Alfa Romeo Guilia TI");
        product2.setPrice(new BigDecimal("700000.00"));
        product2.setImageUrl("http://www.alfaromeo.com/guilia-ti");

        this.products.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Alfa Romeo Guilia Velocle");
        product3.setPrice(new BigDecimal("800000.00"));
        product3.setImageUrl("http://www.alfaromeo.com/guilia-velocle");

        this.products.put(3, product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Alfa Romeo Guilia Quadrifoglio");
        product4.setPrice(new BigDecimal("1400000.00"));
        product4.setImageUrl("http://www.alfaromeo.com/guilia-quadrifoglio");

        this.products.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Alfa Romeo Stelvio Quadrifoglio");
        product5.setPrice(new BigDecimal("1600000.00"));
        product5.setImageUrl("http://www.alfaromeo.com/stelvio-quadrifoglio");

        this.products.put(5, product5);
    }
}
