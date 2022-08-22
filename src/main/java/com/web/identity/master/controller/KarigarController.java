package com.web.identity.master.controller;

import com.web.identity.core.controller.CRUDController;
import com.web.identity.master.entity.Karigar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 22, 2022
 */
@Controller
@RequestMapping(value="/karigars")
public class KarigarController extends CRUDController<Karigar, Integer>{
    
    public KarigarController() {
        super("Karigar","master","karigars");
        this.viewPath="karigars";
    }
}
