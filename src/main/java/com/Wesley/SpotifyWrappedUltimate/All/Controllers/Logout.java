package com.Wesley.SpotifyWrappedUltimate.All.Controllers;

import com.Wesley.SpotifyWrappedUltimate.All.Services.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.HTML;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

@RestController
public class Logout {

    final
    AuthorizationService auth;

    public Logout(AuthorizationService auth) {
        this.auth = auth;
    }

    @GetMapping("/logout")
    public ResponseEntity logout() throws URISyntaxException {
        auth.Destroy();
        URI uri = new URI("http://localhost:8080/login.html");

        return ResponseEntity.status(HttpStatus.FOUND).location(uri).build();
    }
}
