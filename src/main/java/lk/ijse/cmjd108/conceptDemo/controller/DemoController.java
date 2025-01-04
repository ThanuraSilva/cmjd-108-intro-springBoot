package lk.ijse.cmjd108.conceptDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    @GetMapping
    public String healthCheck(){
        return "Concept Demo App running";
    }
}
