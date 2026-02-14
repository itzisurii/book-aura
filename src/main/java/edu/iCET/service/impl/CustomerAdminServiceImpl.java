package edu.iCET.service.impl;

import edu.iCET.model.dto.CustomerAdminDTO;
import edu.iCET.model.entity.CustomerAdmin;
import edu.iCET.repository.CustomerAdminRepository;
import edu.iCET.repository.impl.CustomerAdminRepositoryImpl;
import edu.iCET.service.CustomerAdminService;

import java.util.ArrayList;
import java.util.List;

public class CustomerAdminServiceImpl implements CustomerAdminService {

    CustomerAdminRepository customerAdminRepository = new CustomerAdminRepositoryImpl();

    public String generateCustomerId() {
        String lastID = customerAdminRepository.getLastCustomerId();

        if (lastID == null){
            return "C001";
        }

        int number = Integer.parseInt(lastID.substring(1));
        number++;

        return String.format("C%03d", number);
    }



    public boolean addCustomer(CustomerAdminDTO customer) {

        CustomerAdmin customerAdmin = new CustomerAdmin(
                customer.getCustomerId(),
                customer.getTitle(),
                customer.getName(),
                customer.getPhone(),
                customer.getEmail()
        );

        return customerAdminRepository.save(customerAdmin);
    }

    @Override
    public List<CustomerAdminDTO> getAllCustomers() {
        List<CustomerAdmin> allEntities = customerAdminRepository.getAll();
        List<CustomerAdminDTO> dtos = new ArrayList<>();

        for (CustomerAdmin c : allEntities){
            dtos.add(new CustomerAdminDTO(
                    c.getCustomerId(),
                    c.getTitle(),
                    c.getName(),
                    c.getPhone(),
                    c.getEmail()
            ));
        }

        return dtos;
    }

    @Override
    public void deleteCustomerDetails(String id) {
        customerAdminRepository.deleteCustomerDetails(id);
    }
}
