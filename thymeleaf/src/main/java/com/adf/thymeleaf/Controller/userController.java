package com.adf.thymeleaf.Controller;

import com.adf.thymeleaf.Model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class userController {

    // handle method to handle the variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        user user = new user("Kumar","kumar@gmail.com","admin","Male");
        model.addAttribute("user",user);
        return "variable-expression";
    }

    // handler method the handle the selection-expression request
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        user user = new user("Dhinesh","Dhinesh@gmail.com","Admin","Male");
        model.addAttribute("user",user);
        return "selection-expression";
    }

    //handle method to handle message expressions request.
    @GetMapping("message-expression")
    public String messageExpresssion(){
        return "message-expression";
    }

    //handle method to handle link message request.
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";
    }

    //handler method to handle freagment Expression request
    @GetMapping("fragment-expression")
    public String frgementExpression(){
        return "fragment-expression";
    }

    //handler method
    @GetMapping("/users")
    public String users(Model model){
        user admin = new user("admin","admin@gmail.com","ADMIN","male");
        user dk = new user("dk","dk@gmail.com","USER","Male");
        user vel = new user("vel","vel@gmail.com","USER","Male");
        List<user> users = new ArrayList<>();
        users.add(admin);
        users.add(dk);
        users.add(vel);
        model.addAttribute("users",users);
        return "users";

    }

}
