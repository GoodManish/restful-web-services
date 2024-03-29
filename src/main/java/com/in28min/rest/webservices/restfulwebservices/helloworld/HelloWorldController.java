package com.in28min.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @GetMapping(path = "/helloworld")
    public String helloWorld(){
        return "HelloWorld!!!";
    }

    @GetMapping(path = "/helloworldbean")
    public HelloWorldBean helloWorldBean(){
        throw new RuntimeException("Error!! Contact Support Team --- ** ---");
    }

    @GetMapping(path = "/helloworldbean/pathvariable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello-World-Bean to ---> %s",name));
    }
}
