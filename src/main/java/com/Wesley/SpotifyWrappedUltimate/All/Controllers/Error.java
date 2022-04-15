package com.Wesley.SpotifyWrappedUltimate.All.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Error implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public ModelAndView cancel (ModelMap model){
        model.addAttribute("attribute", "redirectWithRedirectPrefix");
        return new ModelAndView("redirect:/login.html", model);
    }
}
