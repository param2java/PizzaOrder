package com.jrnd.po.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jrnd.po.entity.AddressDO;
import com.jrnd.po.service.AddressService;

@Controller
public class AddressController {
		
	@Autowired
	private AddressService service;
	
	@RequestMapping("/show-adress")
	public String showPage() {
		return "Address-Reg";
	}
	
	@RequestMapping(value = "/insert-address", method = RequestMethod.POST)
	public String insertAddress(@ModelAttribute("address") AddressDO address,
			ModelMap map) {
		// Save Object
		String addressId = service.saveAddress(address);
		map.addAttribute("msg", "Pizza saved with Id:" + addressId);
		return "Address-Reg";
	}
}
