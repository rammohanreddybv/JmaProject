package com.needa.jma.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("preferences")
	public String preferences() {
		return "preferences";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	@RequestMapping("/sdru")
	public String sdru() {
		return "sdru";
	}
	
	@RequestMapping("/xran")
	public String xRan() {
		return "xran";
	}
	
	@RequestMapping("tekromtool")
	public String tekRomTool() {
		return "tekromtool";
	}

	@RequestMapping("...")
	public String more() {
		
		return "...";
	}
	
	@RequestMapping("rfpsupport")
	public String rfpSupport() {
		return "rfpsupport";
	}
	
	@RequestMapping("projectregistration")
	public String projectRegistration() {
		return "projectregistration";
	}
	
	@RequestMapping("salestools")
	public String salesTools() {
		return "salestools";
	}
	
	@RequestMapping("SpecificationDocuments")
	public String specificationDocuments() {
		return "SpecificationDocuments";
	}
	
	@RequestMapping("ProductPortfolio")
	public String productPortfolio() {
		return "ProductPortfolio";
	}
	
	@RequestMapping("tekromtooldocuments")
	public String tekRomToolDocuments() {
		return "tekromtooldocuments";
	}
	
	@RequestMapping("rwavefiles")
	public String rWaveFiles() {
		return "rwavefiles";
	}
}

