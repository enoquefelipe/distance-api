package com.maxipago.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author enoque.felipe
 *
 */
@Controller
public class RouteController {

	@RequestMapping(value = "/")
	public String index() {
		return "redirect:api/cities.json";
	}

}
