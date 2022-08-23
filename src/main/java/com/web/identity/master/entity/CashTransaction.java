package com.web.identity.master.entity;

import com.web.identity.core.entity.MasterEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 23, 2022
 */
@Entity
@Table(name="tbl_cash_transaction")
public class CashTransaction extends  MasterEntity{
    
    @Column(name = "date",insertable = false, updatable = false)
    @CreationTimestamp
    private Date date;
    
    @Column(name = "description")    
    private String description;
    
    @Column(name = "cash_to")    
    private String cashTo;
        
    @Column(name = "cash_from")    
    private String cashFrom;
    
    @Column(name = "amount")    
    private String amount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCashTo() {
        return cashTo;
    }

    public void setCashTo(String cashTo) {
        this.cashTo = cashTo;
    }

    public String getCashFrom() {
        return cashFrom;
    }

    public void setCashFrom(String cashFrom) {
        this.cashFrom = cashFrom;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
}
