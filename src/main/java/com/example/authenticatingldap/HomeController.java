package com.example.authenticatingldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 3/1/22
 */

@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "Welcome to the the website after LDAP Authentication";
	}
}
