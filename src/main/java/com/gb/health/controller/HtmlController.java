package com.gb.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/7/12 0012.
 */
@Controller
public class HtmlController {

    /**
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String hey(Model model){


        model.addAttribute("name","lily");
        model.addAttribute("content","welcome!");

        return "aaa/aa";
    }

}
