package com.jrnd.po.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jrnd.po.entity.PizzaDO;
import com.jrnd.po.service.PizzaService;

@Controller
public class PizzaController {

	@Autowired
	private PizzaService service;
	
	@RequestMapping("/show-pizza")
	public String showPage() {
		return "Pizza-Reg";
	}
	
	@RequestMapping(value = "/insert-pizza", method = RequestMethod.POST)
	public String insertPizza(@ModelAttribute("pizza") PizzaDO pizza,
			ModelMap map) {
		// Save Object
		String pizzaId = service.savePizza(pizza);
		map.addAttribute("msg", "Pizza saved with Id:" + pizzaId);
		return "Pizza-Reg";
	}
	
	@RequestMapping(value="/view-all-pizza")
	public String getAllPizza(@RequestParam("msg") String msg, ModelMap map){
		List<PizzaDO> list = null;
		list = service.getAllPizza();
		if(list!=null){
			map.addAttribute("pizzaList", list);
			
		}
		if(msg.equalsIgnoreCase("0")){
			map.addAttribute("msg","");
		}else{
			map.addAttribute("msg", msg);
		}
		return "Pizza-Data";
	}
	
	@RequestMapping(value="/edit-pizza")
	public String editPizza(@RequestParam("pizzaId") String pizzaId, ModelMap map){
		PizzaDO pizza = service.getPizzaById(pizzaId);
		if(PizzaDO.class.isInstance(pizza)){
			map.addAttribute("pizza",pizza);
		}
		return "Pizza-Edit";
	}
	
	@RequestMapping(value="/update-pizza", method = RequestMethod.POST)
	public String updatePizza(@ModelAttribute("pizza") PizzaDO pizza,  ModelMap map){
		if(pizza!=null){
			service.updatePizza(pizza);
		}
		
		return "redirect:/view-all-pizza.htm?msg=Id"+pizza.getPizzaId()+" is Updated";
	}
	
	@RequestMapping(value="/delete-pizza")
	public String updat(@RequestParam("pizzaId") String pizzaId, ModelMap map){
		if(pizzaId!=null){
			service.deletePizza(pizzaId);
		}
		
		return "redirect:/view-all-pizza.htm?msg=Id "+pizzaId+" is Deleted";
	}
	
}
