package net.theiva.Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.theiva.Model.HelloWorld;

@Controller

public class MvcController {
	@RequestMapping("/hello")
	public String handler(Model model) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
        helloWorld.setDateTime(LocalDateTime.now().toString());
        model.addAttribute("helloWorld", helloWorld);
        return "helloworld";
    }
}
