package sunbase.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sunbase.base.entity.Customer;
import sunbase.base.repository.CustomerRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllStduents() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer updateCustomer(Customer customer) {

        return  customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(UUID id) {

        customerRepository.deleteById(id);

    }


}
