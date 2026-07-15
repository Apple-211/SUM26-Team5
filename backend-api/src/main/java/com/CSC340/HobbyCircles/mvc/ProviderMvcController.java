package com.CSC340.HobbyCircles.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProviderMvcController {

    @GetMapping("/provider-profile")
    public String showProviderProfile() {
        return "provider-profile";
    }
}