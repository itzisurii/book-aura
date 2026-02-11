package edu.iCET.repository;

import edu.iCET.model.entity.CustomerAdmin;

import java.util.Arrays;

public interface CustomerAdminRepository {

    String getLastCustomerId();

    boolean save(CustomerAdmin customerAdmin);

}
