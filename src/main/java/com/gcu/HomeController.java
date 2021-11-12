package com.gcu;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

	


@RequestMapping("/")

public String getHome() {
	
	return "hello world";
}
}
