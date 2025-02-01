package com.adf.thymeleaf.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    // handle method to handle /helloworld
    //http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloworld(Model model){
        model.addAttribute("message","Hello world");
        return "hello-world";
    }

}
