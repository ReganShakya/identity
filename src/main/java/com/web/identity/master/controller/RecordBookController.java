package com.web.identity.master.controller;

import com.web.identity.core.controller.CRUDController;
import com.web.identity.master.entity.RecordBook;
import com.web.identity.master.repository.KarigarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 22, 2022
 */
@Controller
@RequestMapping(value="/recordbooks")
public class RecordBookController extends CRUDController<RecordBook, Integer>{
    
    @Autowired
    private KarigarRepository karigarRepository;

    public RecordBookController() {
        super("Recordbook","master","recordbooks");
        this.viewPath="recordbooks";
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
