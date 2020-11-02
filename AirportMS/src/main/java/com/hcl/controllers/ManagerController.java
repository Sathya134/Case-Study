package com.hcl.controllers;

import javax.validation.Valid;

import com.hcl.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entities.Manager;

 

@Controller
@RequestMapping("/registermanager")
public class ManagerController {
    
    @Autowired
    private ManagerService managerService;
    @GetMapping("/form")
    public String showPersonsForm(Model model) {
        Manager manager=new Manager();
        model.addAttribute(manager);
        return "registermanager";
    }
    @PostMapping("/processmanager")
    public String processForm(@ModelAttribute("manager") @Valid Manager manager,BindingResult result) {
        if(result.hasErrors())
        return "registermanager";
        managerService.insertManager(manager);
        return "confirmmanager";
    }
        
        
        
        
        
    }