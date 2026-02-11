package edu.iCET.model.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerAdmin {
    private String customerId;
    private String title;
    private String name;
    private String phone;
    private String email;
}
