package com.gcu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.gcu.Contactus;
import com.gcu.FormSubmission;



@Controller
public class HomeController {

	




@GetMapping("/payment")

public String getPayment(Model model) {
	
	model.addAttribute("processinformation", new FormSubmission());
	return "payment";
	
	
}

@GetMapping("/concepts")
public String contact()
{
	return "Concepts";
}

@GetMapping("/t&t")
public String showTandT()
{
	return "TandT";
}


@PostMapping("/informationsubmit")
public String informationSubmit(@ModelAttribute FormSubmission formsubmission ,Model model) {
	
	model.addAttribute("processinformation", formsubmission);
	return "informationsubmission";
}


@PostMapping("/contactussubmit")
public  String contactusSubmit(@ModelAttribute Contactus contacus, Model model) {
	
	model.addAttribute("processcontactus", contacus);
	return "contactussubmission";
	
}


@PostMapping("/paymentsubmit")
public ModelAndView payhmentSubmit() {
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("paymentsubmission");
	return modelAndView;
}
@RequestMapping("/contactus")

public String getContact(Model model) {
	
	
	model.addAttribute("processcontactus", new Contactus());
	
	return "Contactus";
}

@GetMapping("/bio")
public String getBio()
{
	return "bio";
}

@RequestMapping("/")

public ModelAndView gethome() {
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("home");
	return modelAndView;
}




}
