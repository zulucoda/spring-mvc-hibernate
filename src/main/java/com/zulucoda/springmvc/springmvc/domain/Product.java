package com.zulucoda.springmvc.springmvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
     private String description;
     private BigDecimal price;
     private String imageUrl;

     public Integer getId(){
         return this.id;
     }

     public void setId(Integer id){
         this.id = id;
     }

     public String getDescription(){
         return this.description;
     }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice(){
         return this.price;
    }

    public void setPrice(BigDecimal price){
         this.price = price;
    }

    public String getImageUrl(){
         return this.imageUrl;
    }

    public void setImageUrl(String imageUrl){
         this.imageUrl = imageUrl;
    }
}
