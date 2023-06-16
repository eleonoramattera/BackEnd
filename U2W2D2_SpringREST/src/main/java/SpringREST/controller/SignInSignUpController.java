package SpringREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import SpringREST.model.User;
import SpringREST.service.UserService;

@Controller
public class SignInSignUpController {
	
	@Autowired UserService userService;

	@GetMapping("/login")
	public ModelAndView showFormLogin() {
		return new ModelAndView("login", "userLogin", new User());	
	}
	
	@GetMapping("/register")
	public ModelAndView showFormRegister() {
		return new ModelAndView("register", "userRegister", new User());
		//creo ogg, metto etichetta e lo inietto dentro register
	}
	
	
	
	@PostMapping("/register-user") //@ModelAttribute per prendere oggetto che mi ritorna dal client
	public String submitRegister(@ModelAttribute("userRegister")User registerUser,
			                      ModelMap model) {
		//System.out.println(registerUser);
		String s = userService.registerUserMethod(registerUser);
		//per passare user generato nella pagina register-success
		model.addAttribute("userRegister",s);
		return "response-success";
	}

	@PostMapping("/login-user") 
	public String submitLogin(@ModelAttribute("userLogin")User loginUser,
			                      ModelMap model) {
		//devo leggere db per vedere se email e password inseriti sono corretti
		//System.out.println(loginUser);
		String s = userService.loginUserMethod(loginUser);
		model.addAttribute("userLogin", s);
		return "response-success";
	}
	
	
}
