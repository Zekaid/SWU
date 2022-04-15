package com.Wesley.SpotifyWrappedUltimate.All.Controllers;

import com.Wesley.SpotifyWrappedUltimate.All.Services.AuthorizationService;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.net.*;


@RestController
public class Authorization {

    final
    AuthorizationService auth;

    public Authorization(AuthorizationService auth) {
        this.auth = auth;
    }

    @GetMapping("/login")
    public ResponseEntity login() throws URISyntaxException {
        return auth.login();
    }

    @RequestMapping(value = "/callback", method = RequestMethod.GET)
    public ResponseEntity AccessToken(@RequestParam("code") String code, RestTemplate rest_template) throws URISyntaxException, JSONException {
        auth.AccessToken(code, rest_template);
        URI uri = new URI("http://localhost:8080/info.html");
        //Redirects users to the login page from Spotify API
        return ResponseEntity.status(HttpStatus.FOUND).location(uri).build();
    }

}