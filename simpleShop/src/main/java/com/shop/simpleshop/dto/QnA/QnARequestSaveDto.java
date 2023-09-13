package com.shop.simpleshop.dto.QnA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QnARequestSaveDto {
    private int user_no;
    private int item_no;
    private String title;
    private String content;
    private String password;
}
