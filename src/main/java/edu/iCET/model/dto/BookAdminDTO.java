package edu.iCET.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookAdminDTO {
    private String id;
    private String Title;
    private String Author;
    private String Category;
    private String Qty;
}
