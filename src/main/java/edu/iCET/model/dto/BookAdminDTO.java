package edu.iCET.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookAdminDTO {
    private String Title;
    private String Author;
    private String Category;
    private Integer Qty;
}
