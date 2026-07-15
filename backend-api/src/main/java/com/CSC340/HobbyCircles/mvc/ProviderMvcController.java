package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.provider.Provider;
import com.CSC340.HobbyCircles.provider.ProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProviderMvcController {

    private final ProviderService providerService;

    public ProviderMvcController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping("/provider-profile")
    public String showProviderProfile() {
        return "provider-profile";
    }

    @PostMapping("/provider-profile")
    public String createProvider(@ModelAttribute Provider provider) {
        providerService.createProvider(provider);
        return "redirect:/provider-profile";
    }
}