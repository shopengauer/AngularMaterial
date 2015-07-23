package com.vspavlov.angularmaterial.web;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vasiliy on 23.07.15.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String moc(Model model){
        model.addAttribute("model","Thymeleafmodel");
        return "table";
    }

//    @RequestMapping(value = "/",method = RequestMethod.GET)
//    public String hom(){
//        return "home";
//    }
}
