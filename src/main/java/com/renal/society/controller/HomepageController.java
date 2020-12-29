package com.renal.society.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {
        @GetMapping("/")
        public String renderHome(){
                return "<h1> Welcome to homepage.</h1>";
        }

}
