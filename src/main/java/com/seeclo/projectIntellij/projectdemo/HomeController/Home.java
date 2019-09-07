package com.seeclo.projectIntellij.projectdemo.HomeController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Home {

    public String homeValue(){
        return "home";
    }
}
