package com.sssm.wfe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WfeController {
	
	@RequestMapping("/index")
	public ModelAndView getHomepage() {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", "27");
		return new ModelAndView("index", "model", map);
	}

}
