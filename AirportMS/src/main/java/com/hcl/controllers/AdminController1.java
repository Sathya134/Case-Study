package com.hcl.controllers;

import javax.validation.Valid;
import com.hcl.entities.Admin;
import com.hcl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class AdminController1 {
	@Autowired
	private AdminService adminservice;

	@GetMapping("/form")
	public String showPersonsForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute(admin);
		return "register";
	}

	@PostMapping("/process")
	public String processForm(@ModelAttribute("admin") @Valid Admin admin, BindingResult result) {
		if (result.hasErrors())
			return "register";
			adminservice.insertUser(admin);
			return "confirm";
	}
}
