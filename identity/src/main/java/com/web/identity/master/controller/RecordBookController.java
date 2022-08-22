package com.web.identity.master.controller;

import com.web.identity.core.controller.CRUDController;
import com.web.identity.master.entity.RecordBook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 22, 2022
 */
@Controller
@RequestMapping(value="/record-books")
public class RecordBookController extends CRUDController<RecordBook, Integer>{

    public RecordBookController() {
        super("RecordBook","master","recordBooks");
        this.viewPath="recordBooks";
    }
}
