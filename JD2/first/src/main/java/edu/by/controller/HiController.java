package edu.by.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sukora Stas.
 */
@RestController
public class HiController {
    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hi from controller</h1>";
    }
}
