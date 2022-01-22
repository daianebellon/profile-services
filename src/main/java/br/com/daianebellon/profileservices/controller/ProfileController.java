package br.com.daianebellon.profileservices.controller;

import br.com.daianebellon.profileservices.model.UserSignupDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping
    public String ok() {
        return "ok!";
    }

   /* @PostMapping
    public void signup(@RequestBody UserSignupDTO userSignupDTO) {
        Keycloak.getInstance(
                serverUrl,
                "master",
                "admin", // Change to your admin name
                "password", // Change to your admin password
                "admin-cli");
    }*/

}
