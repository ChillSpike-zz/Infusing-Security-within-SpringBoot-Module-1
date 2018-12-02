package com.test.springboot.app.module1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Module1Controller {

		@RequestMapping("/greeting")
		public String greeting() {
			return "hello Module-1";
		}
}
