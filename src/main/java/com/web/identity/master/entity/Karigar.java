package com.web.identity.master.entity;

import com.web.identity.core.entity.MasterEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 22, 2022
 */
@Entity
@Table(name="tbl_karigar")
public class Karigar extends  MasterEntity{
    
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;    
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "address")
    private String address;
    @Column(name = "status")
    private boolean status;
    @Column(name = "note")
    private String note;
    
    public Karigar() {
    }
    
    public Karigar(int id) {
        this.id=id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }  

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
