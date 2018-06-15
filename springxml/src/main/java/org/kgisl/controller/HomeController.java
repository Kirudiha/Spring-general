package org.kgisl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**

@Controller* HomeController
 */
@Controller
public class HomeController {

    @RequestMapping(value="/home",method = RequestMethod.GET)
    public String printHello(Model model) {
          model.addAttribute("message", "Hello World!!");
          return "home";
       }
}