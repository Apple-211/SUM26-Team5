package com.CSC340.HobbyCircles.provider;


import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;

    }

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    public Provider getProviderById(Long providerId) {
        return providerRepository.findById(providerId).orElse(null);
    }

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);

    }

    public Provider updateProvider(Long providerId, Provider providerDetails) {
        Provider provider = getProviderById(providerId);

        if (provider == null) {
            return null;
        }

        provider.setName(providerDetails.getName());
        provider.setEmail(providerDetails.getEmail());
        provider.setInterests(providerDetails.getInterests());
        provider.setDescription(providerDetails.getDescription());
        provider.setLocation(providerDetails.getLocation());

        return providerRepository.save(provider);
    }

    public void deleteProvider(Long providerId) {
        
        providerRepository.deleteById(providerId);
    }
}
