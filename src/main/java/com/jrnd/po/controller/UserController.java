package com.jrnd.po.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jrnd.po.entity.UserDO;
import com.jrnd.po.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/show-user")
	public String showPage() {
		return "User-Reg";
	}
	
	@RequestMapping(value = "/insert-user", method = RequestMethod.POST)
	public String insertUser(@ModelAttribute("user") UserDO user,
			ModelMap map) {
		// Save Object
		String userId = service.saveUser(user);
		map.addAttribute("msg", "User saved with Id:" + userId);
		return "User-Reg";
	}
	
	@RequestMapping(value="/view-all-user")
	public String getAllUser(@RequestParam("msg") String msg, ModelMap map){
		List<UserDO> list = null;
		list = service.getAllUser();
		if(list!=null){
			map.addAttribute("userList", list);
			
		}
		if(msg.equalsIgnoreCase("0")){
			map.addAttribute("msg","");
		}else{
			map.addAttribute("msg", msg);
		}
		return "User-Data";
	}
	
	@RequestMapping(value="/edit-user")
	public String editUser(@RequestParam("userId") String userId, ModelMap map){
		UserDO user = service.getUserById(userId);
		if(UserDO.class.isInstance(user)){
			map.addAttribute("user",user);
		}
		return "User-Edit";
	}
	
	@RequestMapping(value="/update-user", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("user") UserDO user,  ModelMap map){
		if(user!=null){
			service.updateUser(user);
		}
		
		return "redirect:/view-all-user.htm?msg=Id"+user.getUserEmail()+" is Updated";
	}
	
	@RequestMapping(value="/delete-user")
	public String updat(@RequestParam("userId") String userId, ModelMap map){
		if(userId!=null){
			service.deleteUser(userId);
		}
		
		return "redirect:/view-all-user.htm?msg=Id "+userId+" is Deleted";
	}

}
