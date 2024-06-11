package com.jsp.shoppingcart_application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.shoppingcart_applications.Cart;
import com.jsp.shoppingcart_applications.Customer;

import antlr.collections.List;

@Controller
public class CartController {
	

	@RequestMapping("/viewitemsfromcart")
	public ModelAndView viewItemsFromCart(HttpSession session)
	{
		Customer customer = (Customer) session.getAttribute("customerinfo");
		Cart cart = customer.getCart();
		List<Item> items = cart.getItems();
		
		ModelAndView mav= new ModelAndView();
		mav.addObject("itemslist",items);
		mav.add
		mav.setViewName("displayallitemsfromcart");
		return mav;
		
	}
	
}
