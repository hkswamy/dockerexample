/**
 * 
 */
package com.spribgboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kumaraswami Hosuru
 *
 */
@RestController
@RequestMapping("/docker")
public class DockerController {
	
	@GetMapping("/greet")
	public String getMessage() {
		return "Hello";
	}

}
