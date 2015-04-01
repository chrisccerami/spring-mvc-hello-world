package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greetingQuery(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@RequestMapping("/greeting/{name}")
	public String greetingRest(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}