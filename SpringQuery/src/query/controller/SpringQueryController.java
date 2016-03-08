package query.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Crunchify.com
 * 
 */

@Controller
public class SpringQueryController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>*******Hello Let's Check a key word in Memcache and then on twitter</h3>************</div><br><br>";
		return new ModelAndView("welcome", "rb", message);
	}

	@RequestMapping(value = "/queryweb", method = RequestMethod.POST)
	public String processForm() {

		return "Success";

	}

}
