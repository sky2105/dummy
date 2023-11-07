package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Akash";
	}
	
	@PostMapping("/getList")
	public List  getList(@RequestParam String type1) {
		System.out.println("inside getList");
		List list1 = new ArrayList<>();
		List list2 = new ArrayList<>();
		list1.add("AADHAR CAMP REQUEST");
		list1.add("ACCOUNT ACTIVATION");
		list2.add("ABC");
		list2.add("DEF");
		
		if(type1.equalsIgnoreCase("ASSET PRODUCT"))
		{
			return list1;
		}else if (type1.equalsIgnoreCase("BRANCH BANKING PROCESS")) {
			return  list2;
		}
		return null;
	}
}