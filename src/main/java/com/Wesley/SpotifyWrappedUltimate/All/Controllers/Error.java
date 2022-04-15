package com.Wesley.SpotifyWrappedUltimate.All.Controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Error {
    @GetMapping("/callback?error=access_denied")
    public ModelAndView cancel (ModelMap model){
        model.addAttribute("attribute", "redirectWithRedirectPrefix");
        return new ModelAndView("redirect:/login.html", model);
    }
}
