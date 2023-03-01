package com.examly.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("welcome")
	public String Welcome() {
		return "welcome.html";
	}
}

