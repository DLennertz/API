package com.residencia.dell.entities;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid")
    private Integer orderId;

    @Column(name = "orderdate")
    private Calendar orderDate;


    @OneToMany(mappedBy = "ordersId")
    @JsonManagedReference
    private List<Orderlines> listOrdersLines;

    @NotNull(message="customer nulo")
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "customerid",referencedColumnName = "customerid")
    private Customers customers;

    @Column(name = "netamount")
    private BigDecimal netAmount;

    

    @DecimalMin(value="0",message="valor de totalAmount não pode ser negativo")
    @NotNull(message="valortotal não pode ser nulo")
    @Column(name = "totalamount")
    private BigDecimal totalAmount;
    
    @DecimalMin(value="0",message="valor de tax não pode ser negativo")
   // @DecimalMax(value=totalAmount,message="tax não pode ser maior que totalAmount")
    @NotNull(message="tax não pode ser nulo")
    @Column(name = "tax")
    private BigDecimal tax;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }

    public List<Orderlines> getListOrdersLines() {
        return listOrdersLines;
    }

    public void setListOrdersLines(List<Orderlines> listOrdersLines) {
        this.listOrdersLines = listOrdersLines;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
