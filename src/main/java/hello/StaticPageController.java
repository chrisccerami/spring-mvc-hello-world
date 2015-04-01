package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
}