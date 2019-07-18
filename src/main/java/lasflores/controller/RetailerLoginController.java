package lasflores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import lasflores.model.RetailerVer;
import lasflores.service.RetailerVerify;




@Controller
@RequestMapping("/retailer")
public class RetailerLoginController 
{
	@Autowired
	 private RetailerVerify retailerService;
	
	@GetMapping("/loginForm")
	 public String  showFormForAdd(Model theModel) {
		RetailerVer theRetaileVer=new RetailerVer();
		 theModel.addAttribute("retailer",theRetaileVer);
		 return "login-retailer";
	 }

	@RequestMapping(value = "/loginRetailer",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView processLogin(@ModelAttribute RetailerVer theRetaileVer) {
		RetailerVer retail = retailerService.checkRetailer(theRetaileVer);
		ModelAndView model = null;
		if (theRetaileVer == null) {
			model = new ModelAndView("login-retailer");
			model.addObject("error", "Invalid Username or Password");
		} else {
			model = new ModelAndView("retailer-dashboard");
			model.addObject("retail", retail);
			//model.addObject("usr", usr.getEmail());
		}
		return model;
	}
}
