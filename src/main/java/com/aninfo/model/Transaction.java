package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Long accountCbu;
    private String type;
    private Double sum;

    public Transaction(String type, Double sum, Long accountCbu) {
        this.type = type;
        this.sum = sum;
        this.accountCbu = accountCbu;
    }
    public Transaction() { }
    public Integer getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Double getSum() {
        return sum;
    }
    public void setSum(Double sum) {
        this.sum = sum;
    }
    public Long getAccountCbu() {
        return accountCbu;
    }
    public void setAccountCbu(Long cbu) {
        this.accountCbu = cbu;
    }
}
