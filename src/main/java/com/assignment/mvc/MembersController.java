/*  
 * Ibrahim Ali
 * 301022172
 * 09-03-2021
 * */

package com.assignment.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MembersController {

	@Autowired
	private MembersRepository membersRepository;
	
	
	@RequestMapping("/signIn")
	public ModelAndView signIn(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mview = new ModelAndView("signIn");
		return mview;
	}
	
	@RequestMapping("/signUp")
	public ModelAndView signUp(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mview = new ModelAndView("signUp");
		return mview;
	}
	
	@RequestMapping("/submitSignIn")
	public ModelAndView submitSignIn(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			ModelAndView mview = new ModelAndView("editProfile");

			Members member = membersRepository.memberLogIn(request.getParameter("email"), request.getParameter("password"));

			mview.addObject("memberId", member.getMemberId());
			mview.addObject("firstName",member.getFirstName());
			mview.addObject("lastName",member.getLastName());
			mview.addObject("phone",member.getPhone());
			mview.addObject("addressCity",member.getAddressCity());
			mview.addObject("postalCode",member.getPostalCode());
			mview.addObject("gymId",member.getGymId());

			return mview;
		}catch(Exception e) {
			ModelAndView mview = new ModelAndView("signIn");
		
			return mview;
		}
	}
	
	@RequestMapping("/submitSignUp")
	public ModelAndView submitSignUp(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			ModelAndView mview = new ModelAndView("thankYou");

			Members member = new Members();

			member.setFirstName(request.getParameter("firstName"));
			member.setLastName(request.getParameter("lastName"));
			member.setPhone(request.getParameter("phone"));
			member.setAddressCity(request.getParameter("addressCity"));
			member.setPostalCode(request.getParameter("postalCode"));
			member.setGymId(Integer.parseInt(request.getParameter("gymId")));
			member.setEmail(request.getParameter("email")); 
			member.setPassword(request.getParameter("password")); 
			
			membersRepository.save(member);
			
			mview.addObject("firstName",member.getFirstName());
			mview.addObject("lastName",member.getLastName());
		
			return mview;
		}catch(Exception e) {
			ModelAndView mview = new ModelAndView("signUp");
			
			return mview;
		}
	}
	
	@RequestMapping("/editProfile")
	public ModelAndView editPRofile(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			ModelAndView mview = new ModelAndView("thankYou");
			
			Members member = membersRepository.getOne(Integer.parseInt(request.getParameter("memberId")));
			
			member.setFirstName(request.getParameter("firstName"));
			member.setLastName(request.getParameter("lastName"));
			member.setPhone(request.getParameter("phone"));
			member.setAddressCity(request.getParameter("addressCity"));
			member.setPostalCode(request.getParameter("postalCode"));
			member.setGymId(Integer.parseInt(request.getParameter("gymId")));
			
			membersRepository.save(member);
			
			mview.addObject("firstName",member.getFirstName());
			mview.addObject("lastName",member.getLastName());
			
			return mview;
			
		}catch(Exception e) {
			ModelAndView mview = new ModelAndView("index");
			
			return mview;
		}
		
	}
	
}

