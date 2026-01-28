package edu.iCET.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class RentalAdmin {

    @Id
    private String rentalId;
    private String bookId;
    private String customerId;
    private LocalDate issueDate;
    private LocalDate dueDate;
}
