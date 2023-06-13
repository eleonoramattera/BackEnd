package SpringMVC.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
		
		@GetMapping("/home")
		public @ResponseBody String getHomePage() {
			return "homepage moc a mammat";
		}
		
		//con parametri ti tipo query string(?=)
		
		@GetMapping("/home/param")
		public @ResponseBody String getHomePageParamsQueryString(@RequestParam String test) {
			return "Prima pagina MVC Spring con parametro Query String: " + test;
		}
		
		// con parametr di tipo path param {}
		
		@GetMapping("/home/param/{test}/{nome}")
		public @ResponseBody String getHomePageParamsPathParam(@PathVariable String test, @PathVariable String nome ) {
			return "Prima pagina MVC Spring con parametro Path Variable: " + test + nome;
        }
		
		//collegare pagina
		
		@GetMapping("/page")
		public String getPage() {
			return "primaThymeleaf";
		}
		
		// paramentro path param {}
		@GetMapping("/page1/{fullname}")
		public String getPage1(@PathVariable String fullname) {
			System.out.println(fullname);
			return "primaThymeleaf";
		}
		
		//per leggere paramentro nella pag html METODO 1
		@GetMapping("/page2/{fullname}")
		public String getPage2(Map<String, Object > model, @PathVariable String fullname) {
			model.put("fullname", fullname);
			System.out.println(fullname);
			return "primaThymeleaf";
		}
		
		//per leggere più paramentri nella pag html
		@GetMapping("/page3/{fullname}/{city}")
		public String getPage3(Map<String, Object > model, @PathVariable String fullname, @PathVariable String city) {
			model.put("fullname", fullname);
			model.put("city", city);
			System.out.println(fullname);
			System.out.println(city);
			return "primaThymeleaf";
		}
		
		//per leggere più paramentri nella pag html METODO 2
				@GetMapping("/page4/{fullname}/{city}/{age}")
				public String getPage4(Model model, @PathVariable String fullname, @PathVariable String city, @PathVariable Integer age) {
					model.addAttribute("fullname", fullname);
					model.addAttribute("city", city);
					model.addAttribute("age", age);
					
					return "primaThymeleaf";
				}
				
       //per leggere più paramentri nella pag html METODO 3
		@GetMapping("/page5/{fullname}/{city}/{age}")
		public String getPage5(ModelMap model, @PathVariable String fullname, @PathVariable String city, @PathVariable Integer age) {
			model.addAttribute("fullname", fullname);
			model.addAttribute("city", city);
			model.addAttribute("age", age);
			
			return "primaThymeleaf";
				}		
		
		//per leggere più parametri nella pag html METODO 4
		@GetMapping("/page4/{fullname}/{city}")
		public ModelAndView getPage(@PathVariable String fullname, @PathVariable String city) {
			String page = fullname != "" ? "pageThymeleaf" : "errorPage";
			ModelAndView model = new ModelAndView(page);
			model.addObject("fullname", fullname);
			model.addObject("city", city);
			return model;
		}
	}






	
