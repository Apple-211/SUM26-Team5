package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.provider.Provider;
import com.CSC340.HobbyCircles.provider.ProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;
import java.util.List;

@Controller
public class ProviderMvcController {

    private final ProviderService providerService;

    public ProviderMvcController(ProviderService providerService) {
        this.providerService = providerService;
    }

   @GetMapping("/provider-profile")
    public String showProviderProfile(Model model) {

    List<Provider> providers = providerService.getAllProviders();

    if (!providers.isEmpty()) {
        Provider latestProvider = providers.get(providers.size() - 1);
        model.addAttribute("provider", latestProvider);
    }

    return "provider-profile";
}

    @PostMapping("/provider-profile")
    public String createProvider(@ModelAttribute Provider provider) {
        providerService.createProvider(provider);
        return "redirect:/provider-profile";
    }
}