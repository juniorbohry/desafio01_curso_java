package com.devsuperior.primeirodesafio.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
//    @Autowired
    private Integer code;

//    @Autowired
    private Double basic;

//    @Autowired
    private Double discount;

    public Order() {
    }

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getValueDiscount() {
        return (discount/100) * basic;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
