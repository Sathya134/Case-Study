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

import com.hcl.entities.Hangar;
import com.hcl.service.HangarService;

 

@Controller
@RequestMapping("/registerhangar")
public class HangarController {
    
    @Autowired
    private HangarService hangarService;
    @GetMapping("/form")
    public String showHangar(Model model) {
        Hangar hangar=new Hangar();
        model.addAttribute(hangar);
        return "registerhangar";
    }
    @PostMapping("/processhangar")
    public String processHangar(@ModelAttribute("hangar") @Valid Hangar hangar,BindingResult result) {
        if(result.hasErrors())
        return "registerhangar";
        hangarService.insertHangar(hangar);
        return "confirmhangar";
    }
    
    
    
    
}
