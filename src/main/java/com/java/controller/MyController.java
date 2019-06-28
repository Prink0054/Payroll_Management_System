package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.dao.MyDao;
import com.java.model.User;

@Controller
public class MyController {

	@Autowired
	MyDao dao;
	
	
	@RequestMapping(value="/")
	public String getHome()
	{
		return "home";
	}
	
	@RequestMapping(value="/checkUser",method=RequestMethod.POST)
	public String postLogin(@ModelAttribute("user")User user,Model model)
	{
		User loginUser=dao.checkLogin(user.getEmail(), user.getPassword());
		
		System.out.println();
		if(loginUser != null && loginUser.getUser_type().equals("Administrator")) {
			return "redirect:/adminHome"; 
		}
		else {
			model.addAttribute("message", "Email or password is incorrect!!");
			return "home";
		}
		}
	
	@RequestMapping(value="/logout")
	public String doneLogout(Model model)
	{
		model.addAttribute("msg", "Logout successfull");
		
		return "home";
	}

	@RequestMapping(value="/adminHome")
	public String getAdminHome(Model model)
	{
		return "AdminHome";
	}
	
	@RequestMapping(value="/addEmployee")
	public String addEmployee(Model model) {
		model.addAttribute("allemp",dao.getall() );
		return "EmployeeList";
	}

	@RequestMapping(value="/getSaveEmployee")
	public String getAddEmployee() {
		return "NewEmployee";
	}
	@RequestMapping(value="/saveEmployee", method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("name")String name,@ModelAttribute("contact_number")String contact_number,
			@ModelAttribute("user_type")String user_type,
			@ModelAttribute("email")String email,@ModelAttribute("password")String password) {
		
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		user.setContact_number(contact_number);
		user.setUser_type(user_type);
		user.setPassword(password);
		dao.save(user);
		return "redirect:/addEmployee";
	}
	
}
