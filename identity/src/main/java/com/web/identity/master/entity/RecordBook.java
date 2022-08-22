package com.web.identity.master.entity;

import com.web.identity.core.entity.MasterEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 22, 2022
 */

@Entity
@Table(name="tbl_record_book")
public class RecordBook extends MasterEntity{
    
    
    @Column(name = "date",insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "product")    
    private String product;
    @Column(name = "qty")
    private int qty;
    @Column(name = "kooraa_price")
    private int kooraaPrice;
    @Column(name = "kaataa_price")
    private int kaataaPrice;
    @Column(name = "kooraa_by")
    private String kooraaBy;
    @Column(name = "kaataa_by")
    private String kaataaBy;
    @Column(name = "sold_by")
    private String soldBy;
    @Column(name = "sold_to")
    private String soldTo;
    @Column(name = "status")
    private String status;
    @Column(name = "selling_price")
    private int sellingPrice;
    @Column(name = "note")
    private String note;
    
    
    public RecordBook() {
    }
    
    public RecordBook(int id) {
        this.id=id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getKooraaPrice() {
        return kooraaPrice;
    }

    public void setKooraaPrice(int kooraaPrice) {
        this.kooraaPrice = kooraaPrice;
    }    
    
    public int getKaataaPrice() {
        return kaataaPrice;
    }

    public void setKaataaPrice(int kaataaPrice) {
        this.kaataaPrice = kaataaPrice;
    }

    public String getKooraaBy() {
        return kooraaBy;
    }

    public void setKooraaBy(String kooraaBy) {
        this.kooraaBy = kooraaBy;
    }

    public String getKaataaBy() {
        return kaataaBy;
    }

    public void setKaataaBy(String kaataaBy) {
        this.kaataaBy = kaataaBy;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public String getSoldTo() {
        return soldTo;
    }

    public void setSoldTo(String soldTo) {
        this.soldTo = soldTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
