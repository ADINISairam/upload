package lasflores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import lasflores.model.Retailer;

import lasflores.service.RetailerRegService;;


@Controller
@RequestMapping("/retailerReg")
public class RetailerController
{

	 @Autowired
	 private RetailerRegService RetailerRegService;
	 
	 @GetMapping("/showFormRetailer")
		public String showFormForAdd(ModelMap theModel) {
		 Retailer theRetailer=new Retailer();
			//addAttribute will include all the property of NewUserReg
			theModel.addAttribute("retailerReg", theRetailer);
			return "NewRetailerReg-form";
		}
	 @PostMapping("/saveNewRetailerReg")
		public String saveNewUserReg(@ModelAttribute("retailerReg") Retailer theRetailer)
		{ RetailerRegService.saveRetailer(theRetailer);
		return "redirect:/RetailerReg/list";
		}
	 @GetMapping("/list")
	  public String listNewUserRegs(ModelMap theModel)
	  {
		List<Retailer>theRetailer=RetailerRegService.getRetailerReg();
		theModel.addAttribute("retailerReg",theRetailer);
		return "list-RetailerUser";
	  }
	
	 
}

