package edu.iCET.repository;

import edu.iCET.model.entity.CustomerAdmin;

import java.util.Arrays;
import java.util.List;

public interface CustomerAdminRepository {

    String getLastCustomerId();

    boolean save(CustomerAdmin customerAdmin);

    List<CustomerAdmin> getAll();
}
