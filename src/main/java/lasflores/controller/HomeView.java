package lasflores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/home")
public class HomeView 
{
	


 @GetMapping("/homePage")
public String showFormForAdd() { 
	 return "welcome";
		}
 @GetMapping("/logoReturn")
public String showFormLogo() { 
	 return "welcome";
		}
 @GetMapping("/menPage")
public String MenAdd() { 
	 return "men";
		}
 @GetMapping("/womanPage")
 public String WomanAdd() { 
 	 return "woman";
 		}
 
 @GetMapping("/contactPage")
 public String contactView() { 
 	 return "contact";
 		}
	
	
	
}
