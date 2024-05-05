package com.Shooping_Cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	/*
	 * @Autowired private CategoryService categoryService;
	 * 
	 * @Autowired private ProductService productService;
	 */

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/products")
	public String products() {
		return "product";
	}
	
	@GetMapping("/product")
	public String product() {
		return "view_product";
	}

}
