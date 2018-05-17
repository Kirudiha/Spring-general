package org.kgisl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HelloController
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    
    public String printHello(Model model) {
        System.out.println("HelloController called");
          model.addAttribute("message", "Hello World!!");
          return "hello";
       }
    
}