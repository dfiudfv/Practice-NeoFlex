package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    public Integer plus() {

    }

    @GetMapping("/minus/{a}/{b}")
    public Integer minus() {

    }
}
