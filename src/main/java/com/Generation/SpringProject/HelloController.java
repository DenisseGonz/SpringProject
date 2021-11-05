package com.Generation.SpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hola! Esto significa que Denisse ha podido hacer una correcta conexión :D";
    }

}