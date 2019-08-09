package com.pms.deloitte.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getProductModel(Model model)
	{

		model.addAttribute("product", new Product());
		model.addAttribute("listProducts",this.productService.listProducts());
		model.addAttribute("message","Product added successfully");
		return "product";
	}
	@RequestMapping("/getProductById/{pId}")
	public Product getProductById(@PathVariable("pId")Integer productId)

	{
		return productService.getProductById(productId);

	}

	@RequestMapping(value= "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product :"+p);
		this.productService.addProduct(p);
		return "redirect:/product";
	}
	@RequestMapping(value= "/edit/add/update", method = RequestMethod.POST)
	public String updatePerson(@ModelAttribute("product") Product p){
		System.out.println("#####product updating :"+p);
		this.productService.updateProduct(p);
		return "redirect:/product";
	}

	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable("pId")Integer productId)
	{
		this.productService.deleteProduct(productId);
		return "redirect:/product";	

	}

	@RequestMapping("/edit/{pId}")
	public String editProduct(@PathVariable("pId") Integer productId, Model model){
		model.addAttribute("product", this.productService.getProductById(productId));
		model.addAttribute("listProducts", this.productService.listProducts());
		return "product";
	}
	/*
	@RequestMapping("/updateProduct/")
	public String updateProduct()
	{
		return "product details updated";
	}

	@RequestMapping("/getAllProducts")
	public List <Product> getAllProducts()
	{
		List <Product> products = productService.getAllProducts();
		return products;
	}

	@RequestMapping("/getProductByName/{pId}")
	public List <Product> getProductByName(@PathVariable("pId")String productName)
	{

		List<Product> products = productService.findByProductName(productName);
		return products;


	}
	@RequestMapping("/searchProducts/{min}/{max}")
	public List<Product> getAllProducts(@PathVariable("min")Integer min,@PathVariable("max") Integer max)
	{List <Product> products = productService.searchByPriceRange(min, max);


	return products;

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getProductModel(Model model)
	{

		model.addAttribute("product", new Product());
		model.addAttribute("listProducts",this.productService.getAllProducts());
		return "product";



	 *///}

}
