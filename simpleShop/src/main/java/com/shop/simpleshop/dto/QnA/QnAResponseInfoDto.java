package com.shop.simpleshop.dto.QnA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QnAResponseInfoDto {
    private int qna_no;
    private String title;
    private String content;
    private String id;
}
