
package com.CSC340.HobbyCircles.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long customerId, Customer customerDetails) {
        Customer customer = getCustomerById(customerId);
        if (customer == null) {
            return null;
        }
        customer.setName(customerDetails.getName());
        customer.setEmail(customerDetails.getEmail());
        customer.setPassword(customerDetails.getPassword());
        customer.setPhotoUrl(customerDetails.getPhotoUrl());
        customer.setHobbies(customerDetails.getHobbies());
        customer.setLocation(customerDetails.getLocation());
        customer.setAccountStatus(customerDetails.getAccountStatus());
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    // Returns the customer if email + password match, otherwise null.
    public Customer login(String email, String password) {
        Optional<Customer> found = customerRepository.findByEmail(email);
        if (found.isPresent() && found.get().getPassword().equals(password)) {
            return found.get();
        }
        return null;
    }
}