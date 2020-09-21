package com.innolab.testservice.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calc")
public class CalcController {

    @GetMapping(path = "/methods", produces = "application/json")
    public String getMethods() {
        return "addition; subtraction; kill";
    }

    @GetMapping(path = "/addition/{left}/{right}", produces = "application/json")
    public int getAddition(@PathVariable("left") int left, @PathVariable("right") int right) {
        return left + right;
    }

    @GetMapping(path = "/subtraction/{left}/{right}", produces = "application/json")
    public int getSubtraction(@PathVariable("left") int left, @PathVariable("right") int right) {
        return left - right;
    }

    @DeleteMapping(path = "/kill")
    public int kill() {
        System.exit(0);
        return 0;
    }
}
