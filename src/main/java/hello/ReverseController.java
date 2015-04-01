package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReverseController {

	@RequestMapping("/reverse")
	public String reverseQuery(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", new StringBuilder(name).reverse().toString());
		return "reverse";
	}

	@RequestMapping("/reverse/{name}")
	public String reverseRest(@PathVariable String name, Model model) {
		model.addAttribute("name", new StringBuilder(name).reverse().toString());
		return "reverse";
	}
}