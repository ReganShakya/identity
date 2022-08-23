package com.web.identity.master.controller;

import com.web.identity.core.controller.CRUDController;
import com.web.identity.master.entity.CashTransaction;
import com.web.identity.master.repository.KarigarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 23, 2022
 */
@Controller
@RequestMapping(value="/cashtransactions")
public class CashTransactionController extends CRUDController<CashTransaction, Integer>{
    
    @Autowired
    private KarigarRepository karigarRepository;

    public CashTransactionController() {
        super("CashTransaction","master","cashtransactions");
        this.viewPath="cashtransactions";
    }
    
    @Override
    public String create(Model model) {
        model.addAttribute("karigars", karigarRepository.findAll());
        return super.create(model); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String edit(@PathVariable("id")Integer id, Model model) {
        model.addAttribute("karigars", karigarRepository.findAll());
        return super.edit(id, model); //To change body of generated methods, choose Tools | Templates.
    }
}