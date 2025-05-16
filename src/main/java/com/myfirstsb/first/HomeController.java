package com.myfirstsb.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
//        String viewName = getViewName();
//        System.out.println(viewName);

        System.out.println("appName: "+ appName);

        return "index.html";
    }

    private String getViewName(){
        return "index.html";
    }



    @Value("${spring.application.name}")
    private String appName;
}
