package com.jrnd.po.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jrnd.po.entity.ToppingsDO;
import com.jrnd.po.service.ToppingsService;
@Controller
public class ToppingsController {
	@Autowired
	private ToppingsService service;
	
	@RequestMapping("/show-toppings")
	public String showPage() {
		return "Toppings-Reg";
	}
	
	@RequestMapping(value = "/insert-toppings", method = RequestMethod.POST)
	public String insertPizza(@ModelAttribute("toppings") ToppingsDO toppings,
			ModelMap map) {
		// Save Object
		String toppingsId = service.saveToppings(toppings);
		map.addAttribute("msg", "Pizza saved with Id:" + toppingsId);
		return "Toppings-Reg";
	}
	
	@RequestMapping(value="/view-all-toppings")
	public String getAllToppings(@RequestParam("msg") String msg, ModelMap map){
		List<ToppingsDO> list = null;
		list = service.getAllToppings();
		if(list!=null){
			map.addAttribute("toppingsList", list);
			
		}
		if(msg.equalsIgnoreCase("0")){
			map.addAttribute("msg","");
		}else{
			map.addAttribute("msg", msg);
		}
		return "toppings-Data";
	}
	
	@RequestMapping(value="/edit-toppings")
	public String editToppings(@RequestParam("toppingsId") String toppingsId, ModelMap map){
		ToppingsDO toppings = service.getToppingById(toppingsId);
		if(ToppingsDO.class.isInstance(toppings)){
			map.addAttribute("toppings",toppings);
		}
		return "Pizza-Edit";
	}
	
	@RequestMapping(value="/update-toppings", method = RequestMethod.POST)
	public String updateToppings(@ModelAttribute("toppings") ToppingsDO toppings,  ModelMap map){
		if(toppings!=null){
			service.updateToppings(toppings);
		}
		
		return "redirect:/view-all-toppings.htm?msg=Id"+toppings.getToppingsId()+" is Updated";
	}
	
	@RequestMapping(value="/delete-toppings")
	public String deleteToppings(@RequestParam("toppingsId") String toppingsId, ModelMap map){
		if(toppingsId!=null){
			service.deleteToppings(toppingsId);
		}
		
		return "redirect:/view-all-toppings.htm?msg=Id "+toppingsId+" is Deleted";
	}

}
