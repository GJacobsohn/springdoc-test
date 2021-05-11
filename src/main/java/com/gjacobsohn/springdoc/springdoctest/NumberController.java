package com.gjacobsohn.springdoc.springdoctest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class NumberController {

    @GetMapping("five")
    @ResponseBody
    public Integer retrieveFive() {
        return 5;
    }
}
