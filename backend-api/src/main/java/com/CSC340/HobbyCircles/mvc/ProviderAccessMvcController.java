package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.provider.ProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProviderAccessMvcController {

    private final ProviderService providerService;

    public ProviderAccessMvcController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping("/provider")
    public String showProviderAccessPage(Model model) {

        model.addAttribute(
                "providers",
                providerService.getAllProviders()
        );

        return "provider-access";
    }
}
