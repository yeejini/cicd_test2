package org.example.cicdtest02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String main(){
        return "cicd-test2 autodeployment with git actions";
    }
}
