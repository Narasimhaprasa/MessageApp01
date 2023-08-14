package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishOpertionsController {
	private static final Logger log = LoggerFactory.getLogger(WishOpertionsController.class);
	@GetMapping("/greet")
	public String wishMsg() {
		log.info("Method execution is started.");
		String msg = "Good Morning";
		log.info("Method Execution is ended.");
		return msg;
	}

}
