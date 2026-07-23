package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.provider.Provider;
import com.CSC340.HobbyCircles.provider.ProviderService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String showProviderProfile(
            Model model,
            HttpSession session
    ) {
        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider";
        }

        Provider provider = providerService.getProviderById(providerId);

        if (provider == null) {
            return "redirect:/provider";
        }

        model.addAttribute("provider", provider);

        return "provider-profile";
    }

    @PostMapping("/provider-profile")
    public String createProvider(
            @ModelAttribute Provider provider,
            HttpSession session
    ) {
        Provider savedProvider = providerService.createProvider(provider);

        session.setAttribute("providerId", savedProvider.getProviderId()
        );

        return "redirect:/provider-profile";
    }


    @GetMapping("/provider-profile/new")
    public String showCreateProviderProfile() {
        return "create-provider-profile";
    }
}