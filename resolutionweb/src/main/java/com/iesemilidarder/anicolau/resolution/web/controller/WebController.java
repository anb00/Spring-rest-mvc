package com.iesemilidarder.asoto.resolution.web.controller;

import com.iesemilidarder.asoto.resolution.core.data.Product;
import com.iesemilidarder.asoto.resolution.core.data.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * com.iesemilidarder.asoto.resolution.web.controller
 * Class WebController
 * By berto. 15/11/2018
 */
@Controller
public class WebController {
    @RequestMapping("/")
    public String index(HttpSession session, Model model) {
        List<String> data = Arrays.asList("yuhu1", "yuhu2", "yuhu3");
        //data.it
        model.addAttribute("datil",data);
        //model.addAttribute("ip",session.get)
        //session.getServletContext().getip
        return "index";
    }
    @RequestMapping("/macros")
    public String macroTest(HttpSession session, Model model) {
        return "macroTest";
    }

}
