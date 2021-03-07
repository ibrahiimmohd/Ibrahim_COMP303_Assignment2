package com.assignment.mvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GymController {

	@Autowired
	private GymRepository gymRepository;
	
	@Autowired
	private MembersRepository membersRepository;
	
	@GetMapping("/")
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mview = new ModelAndView("index");


		return mview;
	}
	
}
