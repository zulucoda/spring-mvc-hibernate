package com.zulucoda.springmvc.springmvc.domain;

/*** 
 * Created by Muzikayise Flynn Buthelezi (zulucoda) on 2018/04/09
 */
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String state;
    private String zipCode;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAddressLineOne(String addressLineOne){
        this.addressLineOne = addressLineOne;
    }
    public String getAddressLineOne(){
        return this.addressLineOne;
    }

    public void setAddressLineTwo(String addressLineTwo){
        this.addressLineTwo = addressLineTwo;
    }
    public String getAddressLineTwo(){
        return this.addressLineTwo;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public String getZipCode(){
        return this.zipCode;
    }
}
