package edu.iCET.service.impl;

import edu.iCET.model.dto.BookAdminDTO;
import edu.iCET.service.BookAdminService;

public class BookAdminServiceImpl implements BookAdminService {

    @Override
    public boolean addBook(BookAdminDTO book) {
        return false;
    }

    @Override
    public String generatedBookId() {
        return "";
    }
}
