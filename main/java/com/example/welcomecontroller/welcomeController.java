package com.example.welcomecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    //GET /name : returns “My name is .......”
    @GetMapping(path = "/name")
    public String name(){
        return "My name is Kholud";
    }

    // GET /age : returns “My age is ........”

    @GetMapping(path = "/age")
    public String age(){
        return "My age is 23";
    }

    // GET /check/status : returns “Everything OK”
    @GetMapping(path = "check/status")
    public String check(){
        return "Everything OK";
    }

    //GET /health : returns “Server health is up and running”
    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }

    //Get /names : return array of names
    @GetMapping(path = "/names")
    public String[] getNames(){

        String[] names = {"Kholud", "Mohammed", "Ali"};
        return names;
    }



}
