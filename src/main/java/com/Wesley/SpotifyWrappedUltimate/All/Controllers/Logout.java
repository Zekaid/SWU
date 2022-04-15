package com.Wesley.SpotifyWrappedUltimate.All.Controllers;

import com.Wesley.SpotifyWrappedUltimate.All.Services.AuthorizationService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Logout {

    final
    AuthorizationService auth;

    public Logout(AuthorizationService auth) {
        this.auth = auth;
    }

    @GetMapping("/logout")
    public ModelAndView logout(ModelMap model) {
        auth.Destroy();
        model.addAttribute("attribute", "redirectWithRedirectPrefix");
        return new ModelAndView("redirect:/login.html", model);
    }
}
