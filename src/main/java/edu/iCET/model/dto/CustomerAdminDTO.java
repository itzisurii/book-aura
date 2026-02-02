package edu.iCET.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class CustomerAdminDTO {
    private String customerId;
    private String title;
    private String name;
    private String phone;
    private String email;
}
