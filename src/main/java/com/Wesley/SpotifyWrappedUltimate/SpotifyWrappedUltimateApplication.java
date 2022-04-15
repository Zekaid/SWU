package com.Wesley.SpotifyWrappedUltimate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class SpotifyWrappedUltimateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyWrappedUltimateApplication.class, args);
	}
	@GetMapping("")
	public ModelAndView start(ModelMap model){
		model.addAttribute("attribute", "redirectWithRedirectPrefix");
		return new ModelAndView("redirect:/login.html", model);
	}

}
