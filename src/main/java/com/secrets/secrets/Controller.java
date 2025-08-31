package com.secrets.secrets;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${nonsecret.key}")
    String nonscretKey;

    @Value("${secret.key}")
    String secretKey;

    @GetMapping
    public String getMethodName(){
        return "Icke hemlig nyckel: " + nonscretKey + " HEMLIG NYCKEL: " + secretKey;
    }

}
