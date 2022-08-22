/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.identity.core.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author regan
 */
@MappedSuperclass
public class MasterEntity {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    protected int id; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MasterEntity() {
    }

    public MasterEntity(int id) {
        this.id = id;
    }
    
}