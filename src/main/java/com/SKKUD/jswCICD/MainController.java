package com.SKKUD.jswCICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String Welcome(){
        System.out.println("Hello Server");
        return "Hello API";
    }

}
