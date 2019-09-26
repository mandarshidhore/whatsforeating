package com.sssm.wfe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WfeRestController {

	@GetMapping("/getallfoods")
	public List<String> getAllFoods() {
		List<String> foods = new ArrayList<>();
		foods.add("Donuts");
		foods.add("Muffins");
		return foods;
	}

}
