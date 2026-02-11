package edu.iCET.service;

import edu.iCET.model.dto.CustomerAdminDTO;

public interface CustomerAdminService {

    String generateCustomerId();

    boolean addCustomer(CustomerAdminDTO customer);

    void getAllCustomers();

}
