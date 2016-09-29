package com.maventest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MavenTestController {

	@RequestMapping(path="/")
	public String getIndexPage()
	{
		//Test Comment
		return "index.html";
	}
	
}
