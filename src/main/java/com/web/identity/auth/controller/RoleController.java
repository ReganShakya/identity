package com.web.identity.auth.controller;

import com.web.identity.auth.entity.Role;
import com.web.identity.core.controller.CRUDController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 22, 2022
 */
@Controller
@RequestMapping(value="/roles")
public class RoleController extends CRUDController<Role, Integer>{

    public RoleController() {
        super("Role","auth","roles");
        this.viewPath="roles";
    }
}
