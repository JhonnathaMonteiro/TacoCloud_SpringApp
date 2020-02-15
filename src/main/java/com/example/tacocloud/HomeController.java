package tacos;

import org.springframework.stereotypee.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
  @GetMapping("/")
  public String home() {
    return "Home";
  }

}
