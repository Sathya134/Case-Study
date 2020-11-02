package com.hcl.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entities.Plane;
import com.hcl.service.PlaneService;

 

@Controller
@RequestMapping("/registerplane")
public class PlaneController {
    
    @Autowired
    private PlaneService planeService;
    @GetMapping("/form")
    public String showPersonsForm(Model model) {
        Plane plane=new Plane();
        model.addAttribute(plane);
        return "registerplane";
    }
    @PostMapping("/processplane")
    public String processForm(@ModelAttribute("plane") @Valid Plane plane,BindingResult result) {
        if(result.hasErrors())
        return "registerplane";
        planeService.insertPlane(plane);
        return "confirmplane";
    }
        
        
        
        
        
    }
