package com.example;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	@GetMapping("/")
	public String Hello() {
		return "anime.html";
	}

}
