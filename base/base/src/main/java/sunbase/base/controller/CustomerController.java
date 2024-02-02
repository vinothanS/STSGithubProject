package sunbase.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sunbase.base.entity.Customer;
import sunbase.base.service.CustomerService;

import java.util.UUID;

@Controller

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/login")
    public  String getLogin()
    {
        return "login";
    }


    @GetMapping("/customers")
    public String  listCustomer(Model model)
    {
        model.addAttribute("customers",customerService.getAllStduents());
        return  "customers";

    }

    @GetMapping("/customers/new")
    public  String createCustomerForm(Model model)
    {

        Customer customer=new Customer();
        model.addAttribute("customer",customer);
        return "create_customer";
    }


    @PostMapping("/customers")

    public  String saveCustomer(@ModelAttribute("customer")Customer customer)
    {
        customerService.saveCustomer(customer);
     return "redirect:/customers";
    }




    @GetMapping("/customers/edit/{id}")
    public String editCustomer(@PathVariable UUID id,Model model)
    {
        model.addAttribute("customer",customerService.getCustomerById(id));
        return "edit_customer";

    }
    @PostMapping("/customers/{id}")
    public String updateCustomer(@PathVariable UUID id,@ModelAttribute("customer")
                                 Customer customer, Model model)
    {
        Customer existingCustomer=customerService.getCustomerById(id);
        existingCustomer.setFirst_name(customer.getFirst_name());
        existingCustomer.setLast_name(customer.getLast_name());
        existingCustomer.setAddress(customer.getAddress());
        existingCustomer.setCity(customer.getCity());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());

        customerService.updateCustomer(existingCustomer);
        return "redirect:/customers";
    }


    @GetMapping("/customers/{id}")

    public  String deleteCustomer(@PathVariable UUID id)
    {
      customerService.deleteCustomerById(id);
      return  "redirect:/customers";
    }

}
