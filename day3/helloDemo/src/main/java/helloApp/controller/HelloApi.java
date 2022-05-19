package helloApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
	@GetMapping(value="/showhello")
	String displayHello() {
		return "hello";
	}

}
