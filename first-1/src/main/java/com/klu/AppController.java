package com.klu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	@GetMapping("/bhanu")
	@ResponseBody
	
	public String fun2() {
		return "PRASAD";
	}

}
