package edu.iCET.service;

import edu.iCET.model.dto.BookAdminDTO;

public interface BookAdminService {
    boolean addBook(BookAdminDTO book);

    String generatedBookId();
}
