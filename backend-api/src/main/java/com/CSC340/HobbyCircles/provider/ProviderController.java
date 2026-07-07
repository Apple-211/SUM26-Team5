package com.CSC340.HobbyCircles.provider;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class ProviderController {

    private final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;

    }

    @GetMapping
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping("/{providerId}")
    public Provider getProviderById(@PathVariable Long providerId) {
        return providerService.getProviderById(providerId);
    }

    @PostMapping
    public Provider createProvider(@RequestBody Provider provider) {
        return providerService.createProvider(provider);

    }

    @PutMapping("/{providerId}")
    public Provider updateProvider(@PathVariable Long providerId, @RequestBody Provider provider) {
        return providerService.updateProvider(providerId, provider);

    }

    //Delete is missing here 

    @DeleteMapping("/{providerId}")
    public void deleteProvider(@PathVariable Long providerId) {
        providerService.deleteProvider(providerId);
    }
}