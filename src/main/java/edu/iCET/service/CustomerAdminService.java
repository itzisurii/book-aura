package edu.iCET.service;

import edu.iCET.model.dto.CustomerAdminDTO;

import java.util.List;

public interface CustomerAdminService {

    String generateCustomerId();

    boolean addCustomer(CustomerAdminDTO customer);

    List<CustomerAdminDTO> getAllCustomers();
}
