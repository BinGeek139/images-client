package com.ptit.client.images.controller;

import com.ptit.client.images.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    ImageService imageService;
    @GetMapping()
    public String index(){

        return "index";
    }
}
