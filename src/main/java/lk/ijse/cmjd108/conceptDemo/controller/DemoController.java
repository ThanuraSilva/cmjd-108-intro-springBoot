package lk.ijse.cmjd108.conceptDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class DemoController {
    @GetMapping
    public String healthCheck(){
        return "Concept Demo App running";
    }
    @PostMapping("/{greeting}")
    public void getData(@PathVariable String greeting){
        System.out.println(greeting);
    }
}
