package com.modisa.bbd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyCalculator {

    @RequestMapping("/")

    public String index()
    {
        int sum;
        int num1 = 5;
        int num2 = 6;

        sum = num1 + num2;
        return ("sum = " + sum);
    }
}
