package lk.ijse.cmjd108.conceptDemo.controller;

import lk.ijse.cmjd108.conceptDemo.dto.Teacher;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
    public String getData(@PathVariable String greeting){
        System.out.println(greeting);
        return greeting;
    }
    @PostMapping(value = "/teacher",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Teacher getTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        System.out.println(teacher.getCity());
        return teacher;
    }
}
