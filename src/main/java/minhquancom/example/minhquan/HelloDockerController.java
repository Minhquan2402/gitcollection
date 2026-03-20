package minhquancom.example.minhquan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloDockerController {

	@GetMapping({"/", "/hello-docker"})
	public String helloDocker(Model model) {
		model.addAttribute("title", "Hello Docker");
		model.addAttribute("message", "Chao mung ban den voi trang Hello Docker");
		model.addAttribute("description", "Trang nay duoc phuc vu bang Spring Boot va Thymeleaf.");
		return "hello-docker";
	}
}