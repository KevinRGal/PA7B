/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.model;

/**
 *
 * @author Kevin
 */
public class OfficesModel {
    private String officeCode;
    private String city;
    private String phone;
    private String addresLine1;
    private String addresLine2;
    private String state;
    private String country;
    private String postaleCode;
    private String territory;
    
    public OfficesModel() {
        
    }
    

    public OfficesModel(String officeCode, String city, String phone, String addresLine1, String addresLine2, String state, String country, String postaleCode, String territory) {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.addresLine1 = addresLine1;
        this.addresLine2 = addresLine2;
        this.state = state;
        this.country = country;
        this.postaleCode = postaleCode;
        this.territory = territory;
    }

    public OfficesModel(String officeCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1(String addresLine1) {
        this.addresLine1 = addresLine1;
    }

    public String getAddresLine2() {
        return addresLine2;
    }

    public void setAddresLine2(String addresLine2) {
        this.addresLine2 = addresLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostaleCode() {
        return postaleCode;
    }

    public void setPostaleCode(String postaleCode) {
        this.postaleCode = postaleCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }
     
    
}
