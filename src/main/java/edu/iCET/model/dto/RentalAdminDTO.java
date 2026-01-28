package edu.iCET.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalAdminDTO {
    private String rentalId;
    private String bookId;
    private String customerId;
    private LocalDate issueDate;
    private LocalDate dueDate;
}
