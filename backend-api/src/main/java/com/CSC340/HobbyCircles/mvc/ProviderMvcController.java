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
public class ProviderMvcController {  //creates the controller 

    private final ProviderService providerService;

    public ProviderMvcController(ProviderService providerService) { //constructor
        this.providerService = providerService; //stores the service inside the controller
    }

   @GetMapping("/provider-profile")
    public String showProviderProfile(Model model) { //method 

    List<Provider> providers = providerService.getAllProviders();
     //model let's data be sent to the file

    if (!providers.isEmpty()) {
        Provider latestProvider = providers.get(providers.size() - 1); // latest provider
        model.addAttribute("provider", latestProvider); //send the provider to .ftlh file
    } 

    return "provider-profile";
}

    @PostMapping("/provider-profile")
    public String createProvider(@ModelAttribute Provider provider) { //creates a provider from this form
        providerService.createProvider(provider);  //send the provider to the service , then saved to the database
        return "redirect:/provider-profile";
    }
}