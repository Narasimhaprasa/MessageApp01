package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageOpertionsController {
	private final static Logger log = LoggerFactory.getLogger(MessageOpertionsController.class);

	@GetMapping("/wish")
	public String getWishMessage() {
		log.info("Method Execution is Started");
		String msg = "Welcome to Real World...!";
		log.info("Method Execution is ended");
		return msg;
	}

}
