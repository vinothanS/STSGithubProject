package sunbase.base.service;

import sunbase.base.entity.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    List<Customer>  getAllStduents();
    private String newID()
    {
        return  java.util.UUID.randomUUID().toString();
    }

    Customer saveCustomer(Customer customer);


    Customer getCustomerById(UUID id);

    Customer updateCustomer(Customer customer);

    void deleteCustomerById(UUID id);
}
